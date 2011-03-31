package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.bd.data.PersonDao;
import org.company.recordshop.bd.data.RelationDao;
import org.company.recordshop.bd.domain.Person;
import org.company.recordshop.bd.domain.PersonExample;
import org.company.recordshop.bd.domain.Relation;
import org.company.recordshop.bd.domain.RelationExample;
import org.hibernate.criterion.MatchMode;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.queries.SearchParameters;
import org.springframework.beans.factory.annotation.Autowired;

public class FindByExampleWithDoubleBiderectionalAssociattionsTest extends AbstractDaoTestCase {
    
    @Autowired
    private PersonDao personDao;
    
    @Autowired
    private RelationDao relationDao;

    protected DateTime date() {
        return new DateTime(2008, 11, 6, 0, 0, 0, 0);
    }

    @Test
    public void testFindByExampleWithCrossRelations() {

        Person man = new Person("John", "Johnson", date());
        Long manId = personDao.add(man);

        Person woman = new Person("Johanna", "Butterfly", date());
        Long womanId = personDao.add(woman);

        /* Husband: Relation from man to woman */
        Relation husbandRelation = new Relation("Husband");
        Long husbandId = relationDao.add(husbandRelation);

        /* Wife: Relation from woman to man */
        Relation wifeRelation = new Relation("Wife");
        Long wifeId = relationDao.add(wifeRelation);
        flush();

        /* Add man and woman to the husbandRelation */
        husbandRelation.setPersonFrom(man);
        husbandRelation.setPersonTo(woman);
        //relationDao.update(husbandRelation);
        flush();
        
        /* Now add woman and man to the wifeRelation */
        wifeRelation.setPersonFrom(woman);
        wifeRelation.setPersonTo(man);
        flush();
        
        RelationExample relExample = new RelationExample();
        relExample.setName("Husband");
        assertEquals(1, relationDao.findByExample(relExample).size());
        
        PersonExample personExample = new PersonExample();
        personExample.setFirstName("Does not exist");
        relExample.setPersonTo(personExample);
        assertEquals(0, relationDao.findByExample(relExample).size());
        
        personExample.setFirstName("Johanna");
        relExample.setPersonTo(personExample);
        assertEquals(1, relationDao.findByExample(relExample).size());
       
        relExample.setPersonTo(new PersonExample(womanId));
        assertEquals(1, relationDao.findByExample(relExample).size());
        
        relExample = new RelationExample();
        personExample = new PersonExample();
        personExample.setFirstName("Joh");
        relExample.setPersonTo(personExample);
        relExample.setPersonFrom(personExample);
        SearchParameters searchParam = new SearchParameters();
        searchParam.setMatchMode(MatchMode.START);
        assertEquals(2, relationDao.findByExample(relExample, searchParam).size());
    }
}
