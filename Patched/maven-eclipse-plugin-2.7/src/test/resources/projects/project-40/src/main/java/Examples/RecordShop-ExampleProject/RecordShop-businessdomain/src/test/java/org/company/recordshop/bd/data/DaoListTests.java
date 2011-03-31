package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Customer;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Johan Vogelzang
 * 
 */
public class DaoListTests extends AbstractDaoTestCase {

    public class CustomerComparator implements Comparator<Customer> {
        public int compare(Customer one, Customer other) {
            return (one.getFirstName() + one.getLastName()).compareTo(other.getFirstName() + other.getLastName());
        }
    }

    @Autowired
    private CustomerDao customerDao;

    @Before
    public void setUp() {
        customerDao.add(new Customer("Rembrandt", "van Rijn", new DateTime(2010, 11, 6, 0, 0, 0, 0), 1));
        customerDao.add(new Customer("Saskia", "van Rijn", new DateTime(2011, 11, 6, 0, 0, 0, 0), 2));
        customerDao.add(new Customer("Paulus", "Potter", new DateTime(2012, 11, 6, 0, 0, 0, 0), 3));
        customerDao.add(new Customer("Tim", "Potter", new DateTime(2013, 11, 6, 0, 0, 0, 0), 4));
        flush();
        clear();
    }

    /**
     * Test method for {@link CustomerDao#listAllCustomers()}.
     */
    @Test
    public void testListAllCustomers() {
        assertEquals(4, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        List<Customer> customers = customerDao.listAll();
        assertNotNull(customers);
        assertEquals(4, customers.size());
        Collections.sort(customers, new CustomerComparator()); // Avoid random order.
        assertEquals("Paulus", customers.get(0).getFirstName());
        assertEquals("Rembrandt", customers.get(1).getFirstName());
        assertEquals("Saskia", customers.get(2).getFirstName());
        assertEquals("Tim", customers.get(3).getFirstName());
    }

    /**
     * Tests method for {@link CustomerDao#listPage(int, inst, String, boolean)}.
     */
    @Test
    public void testSortedAscendingList(){
        List<Customer> customers = customerDao.listPage(0, 3, "firstName", true);
        assertEquals("Paulus", customers.get(0).getFirstName());
        assertEquals("Rembrandt", customers.get(1).getFirstName());
        assertEquals("Saskia", customers.get(2).getFirstName());
    }
    
    /**
     * Tests method for {@link CustomerDao#listPage(int, int, String, boolean)}.
     */
    @Test
    public void testSortedDescendingList(){
        List<Customer> customers = customerDao.listPage(0, 4, "firstName", false);
        assertEquals("Tim", customers.get(0).getFirstName());
        assertEquals("Saskia", customers.get(1).getFirstName());
        assertEquals("Rembrandt", customers.get(2).getFirstName());
        assertEquals("Paulus", customers.get(3).getFirstName());
    }
    
    /**
     * Tests method for {@link CustomerDao#listPage(int, int, String, boolean)}.
     */
    @Test
    public void testStringSortedAscendingPagedList(){
        List<Customer> customers = customerDao.listPage(1, 2, "firstName", true);
        assertEquals("Rembrandt", customers.get(0).getFirstName());
        assertEquals("Saskia", customers.get(1).getFirstName());
    }
    
    /**
     * Tests method for {@link CustomerDao#listPage(int, int, String, boolean)}.
     */
    @Test
    public void testIntSortedDescendingPagedList(){
        List<Customer> customers = customerDao.listPage(1, 2, "customerNr", false);
        assertEquals(2, customers.size());
        assertEquals(3, customers.get(0).getCustomerNr().intValue());
        assertEquals(2, customers.get(1).getCustomerNr().intValue());
    }
    
    /**
     * Tests method for {@link CustomerDao#listPage(int, int, String, boolean)}.
     */
    @Test
    public void testDateSortedDescendingPagedList(){
        List<Customer> customers = customerDao.listPage(1, 2, "birthDate", false);
        assertEquals(new DateTime(2012, 11, 6, 0, 0, 0, 0), customers.get(0).getBirthDate());
        assertEquals(new DateTime(2011, 11, 6, 0, 0, 0, 0), customers.get(1).getBirthDate());
    }
    
}
