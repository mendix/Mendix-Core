package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.annotation.Rollback;

public class CustomerServiceTest extends AbstractServiceTestCase {

    @Autowired
    CustomerServiceModelLocalService customerServiceModelService;

    @Test
    @Rollback(true)
    public final void testCreateCustomer() {

        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);
        customer.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));

        customerServiceModelService.createCustomer(customer);
        SimpleCustomerDto foundCustomer = customerServiceModelService
                .readCustomer(customerServiceModelService.createCustomer(customer));
        Assert.assertNotNull(foundCustomer);
        Assert.assertTrue(foundCustomer.getCustomerNr() == 12345);
        Assert.assertEquals(foundCustomer.getFirstName(), "Alfred");
        Assert.assertEquals(foundCustomer.getLastName(), "Sloan");
        Assert.assertTrue(foundCustomer.getOrders().isEmpty());
    }

    /**
     * Test whether the same object can be created twice. Should result in an BusinessRuleException.
     */
    @Test
    @Rollback(true)
    @ExpectedException(BusinessRuleException.class)
    public final void testCreateCustomerTwice() {

        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);

        customerServiceModelService.createCustomer(customer);
        SimpleCustomerDto foundCustomer = customerServiceModelService
                .readCustomer(customerServiceModelService.createCustomer(customer));
        Assert.assertNotNull(foundCustomer);
        customerServiceModelService.createCustomer(foundCustomer);
    }

    /**
     * Test whether an object can be created while one of his properties violates a constraint.
     * Should result in a BusinessRuleException.
     */
    @Test
    @ExpectedException(BusinessRuleException.class)
    public final void testMinLengthValidation() {

        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(-1);
        customer.setUsername("a"); // violates minlength = 3 constraint
        customer.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));

        customerServiceModelService.createCustomer(customer);
    }

    /**
     * Test whether an object can be created from a null DTO. Should result in a
     * BusinessRuleException.
     */
    @Test
    @ExpectedException(IllegalArgumentException.class)
    public final void testNotNullValidation() {
        customerServiceModelService.createCustomer((SimpleCustomerDto) null);
    }

    @Test
    public final void testReadCustomer() {

        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);
        customer.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        customer = customerServiceModelService.readCustomer(customerServiceModelService
                .createCustomer(customer));
        assertEquals("Alfred", customer.getFirstName());
        assertEquals("Sloan", customer.getLastName());
        Assert.assertTrue(customer.getCustomerNr() == 12345);
    }

    @Test
    public final void testUpdateCustomerSucceed() {

        FullCustomerDto custDto = new FullCustomerDto();
        custDto.setFirstName("Johan");
        custDto.setLastName("Vogelzang");
        custDto.setCustomerNr(54321);
        custDto.setDiscountPercentage(0);
        custDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));

        Long customerId = customerServiceModelService.createCustomer(custDto);
        custDto = customerServiceModelService.readCustomerAsFullCustomerDto(customerId);
        flush();
        custDto.setDiscountPercentage(100);
        customerServiceModelService.updateCustomer(custDto);
        custDto = customerServiceModelService.readCustomerAsFullCustomerDto(customerId);
        assertTrue("DiscountPercentage should be 100", custDto.getDiscountPercentage() == 100);
    }

    @Test
    @ExpectedException(IllegalArgumentException.class)
    public final void testUpdateCustomerFail() {

        FullCustomerDto custDto = new FullCustomerDto();
        customerServiceModelService.updateCustomer(custDto);
    }

    @Test
    public final void testDeleteCustomer() {

        FullCustomerDto custDto = new FullCustomerDto();
        custDto.setFirstName("Nasty");
        custDto.setLastName("Customer");
        custDto.setCustomerNr(666);
        custDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));

        Long id = customerServiceModelService.createCustomer(custDto);
        FullCustomerDto result = customerServiceModelService.readCustomerAsFullCustomerDto(id);
        customerServiceModelService.deleteCustomer(result);
        result = customerServiceModelService.readCustomerAsFullCustomerDto(id);
        assertTrue("result value should be null", result == null);
    }

    @Test
    @ExpectedException(IllegalArgumentException.class)
    public final void testDeleteCustomerFail() {
        FullCustomerDto zombieDto = new FullCustomerDto();
        customerServiceModelService.deleteCustomer(zombieDto);
    }
}
