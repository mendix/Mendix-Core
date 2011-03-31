package org.company.recordshop.service;

import junit.framework.Assert;

import org.company.recordshop.service.dto.PersonDto;
import org.company.recordshop.service.dto.RelationDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MultipleAssociationsTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    @Test
    public void testCreateCrossRelations() {

        PersonDto manDto = new PersonDto();
        manDto.setLastName("Johnson");
        manDto.setFirstName("John");
        manDto.setBirthDate(new DateTime());
        Long manId = customerServiceModelService.createPerson(manDto);

        PersonDto womanDto = new PersonDto();
        womanDto.setLastName("Butterfly");
        womanDto.setFirstName("Susan");
        womanDto.setBirthDate(new DateTime());
        Long womanId = customerServiceModelService.createPerson(womanDto);
        flush();

        /* Husband: Relation from man to woman */
        RelationDto husbandDto = new RelationDto();
        husbandDto.setName("Husband");
        husbandDto.setPersonFrom(customerServiceModelService.readPersonAsPersonDto(manId));
        husbandDto.setPersonTo(customerServiceModelService.readPersonAsPersonDto(womanId));
        Long husbandId = customerServiceModelService.createRelation(husbandDto);
        flush();
        husbandDto = customerServiceModelService.readRelationAsRelationDto(husbandId);

        Assert.assertTrue(husbandId > 0);
        Assert.assertEquals(0, husbandDto.getVersion().intValue());
        Assert.assertEquals(1, husbandDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(1, husbandDto.getPersonTo().getVersion().intValue());

        /*
         * Within the create service the opposite of a bi-directional association is updated, so we
         * always need to get the latest version of the associated object after the transaction has
         * finished. Here it's not sufficient to do: manDto = husbandRelationDto.getPersonFrom();
         * Because the man Person object is flushed at the end of the transaction and a new version
         * is born. So in these situations you'll need to use the read serivce method to get the
         * latest version from the store. If you forget to do this you will run into a
         * ConcurrentUpdateException.
         */
        manDto = customerServiceModelService.readPersonAsPersonDto(manId);
        womanDto = customerServiceModelService.readPersonAsPersonDto(womanId);
        Assert.assertEquals(1, manDto.getVersion().intValue());
        Assert.assertEquals(1, womanDto.getVersion().intValue());

        /* Wife: Relation form woman to man */
        RelationDto wifeDto = new RelationDto();
        wifeDto.setName("Wife");
        wifeDto.setPersonFrom(husbandDto.getPersonTo());
        wifeDto.setPersonTo(husbandDto.getPersonFrom());
        Long wifeRelationId = customerServiceModelService.createRelation(wifeDto);
        flush();

        wifeDto = customerServiceModelService.readRelationAsRelationDto(wifeRelationId);

        Assert.assertEquals(womanId, wifeDto.getPersonFrom().getId());
        Assert.assertEquals(manId, wifeDto.getPersonTo().getId());

        manDto = customerServiceModelService.readPersonAsPersonDto(manDto.getId());
        womanDto = customerServiceModelService.readPersonAsPersonDto(womanDto.getId());
        Assert.assertEquals(2, manDto.getVersion().intValue());
        Assert.assertEquals(2, womanDto.getVersion().intValue());
    }

    /**
     * Update test. First create and store each dto separately. Then add the associated objects and
     * update.
     * 
     */
    @Test
    public void testUpdateCrossRelations() {

        PersonDto manDto = new PersonDto();
        manDto.setLastName("Johnson");
        manDto.setFirstName("John");
        manDto.setBirthDate(new DateTime());
        Long manId = customerServiceModelService.createPerson(manDto);

        PersonDto womanDto = new PersonDto();
        womanDto.setLastName("Butterfly");
        womanDto.setFirstName("Susan");
        womanDto.setBirthDate(new DateTime());
        Long womanId = customerServiceModelService.createPerson(womanDto);

        /* Husband: Relation from man to woman */
        RelationDto husbandRelationDto = new RelationDto();
        husbandRelationDto.setName("Husband");
        Long husbandId = customerServiceModelService.createRelation(husbandRelationDto);

        /* Wife: Relation from woman to man */
        RelationDto wifeRelationDto = new RelationDto();
        wifeRelationDto.setName("Wife");
        Long wifeId = customerServiceModelService.createRelation(wifeRelationDto);
        flush();

        /* Add man and woman to the husbandRelationDto */
        husbandRelationDto = customerServiceModelService.readRelationAsRelationDto(husbandId);
        husbandRelationDto.setPersonFrom(customerServiceModelService.readPersonAsPersonDto(manId));
        husbandRelationDto.setPersonTo(customerServiceModelService.readPersonAsPersonDto(womanId));
        customerServiceModelService.updateRelation(husbandRelationDto);
        flush();
        husbandRelationDto = customerServiceModelService.readRelationAsRelationDto(husbandId);
        Assert.assertEquals(1, husbandRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(1, husbandRelationDto.getPersonTo().getVersion().intValue());
        Assert.assertEquals(1, customerServiceModelService.readPersonAsPersonDto(manId)
                .getVersion().intValue());
        Assert.assertEquals(1, customerServiceModelService.readPersonAsPersonDto(womanId)
                .getVersion().intValue());

        /* Now add woman and man to the wifeRelation */
        wifeRelationDto = customerServiceModelService.readRelationAsRelationDto(wifeId);
        wifeRelationDto.setPersonFrom(husbandRelationDto.getPersonTo());
        wifeRelationDto.setPersonTo(husbandRelationDto.getPersonFrom());
        customerServiceModelService.updateRelation(wifeRelationDto);
        flush();
        wifeRelationDto = customerServiceModelService.readRelationAsRelationDto(wifeId);
        Assert.assertEquals(2, wifeRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(2, wifeRelationDto.getPersonTo().getVersion().intValue());
        Assert.assertEquals(2, customerServiceModelService.readPersonAsPersonDto(manId)
                .getVersion().intValue());
        Assert.assertEquals(2, customerServiceModelService.readPersonAsPersonDto(womanId)
                .getVersion().intValue());
    }
}