package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.CustomerExample;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mendix.runtime.queries.SearchParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

public class PagingSupportCustomerDaoTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;

    private final byte NUMBER_OF_ITEMS = 15;

    protected DateTime date() {
        return new DateTime(2008, 11, 6, 0, 0, 0, 0);
    }

    /**
     * Data initialization
     */
    @Before
    public void setUp() {

        for (int i = 1; i <= NUMBER_OF_ITEMS; i++) {
            Customer customer = new Customer("Customer-" + i, "LastName", date(), i);
            customerDao.add(customer);
        }
        flush();
        clear();
    }

    /**
     * Test method for {@link CustomerDao#count()}.
     */
    @Test
    public void testCountCustomers() {

        assertEquals(NUMBER_OF_ITEMS, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate,
                "Customer_TABLE"));
        assertEquals(NUMBER_OF_ITEMS, customerDao.count());
        assertEquals(NUMBER_OF_ITEMS, customerDao.countByExample(new CustomerExample()));

    }

    /**
     * Test method for {@link CustomerDao#listCustomers(firstResult, maxResults)}.
     */
    @Test
    public void testListCustomersInRange() {

        List<Customer> customers_min1_10 = customerDao.listPage(-1, 10);
        assertNotNull(customers_min1_10);
        assertEquals(10, customers_min1_10.size());

        List<Customer> customers1_5 = customerDao.listPage(1, 5);
        assertNotNull(customers1_5);
        assertEquals(5, customers1_5.size());

        List<Customer> customers6_10 = customerDao.listPage(6, 4);
        assertNotNull(customers1_5);
        assertEquals(4, customers6_10.size());

        List<Customer> customers10_20 = customerDao.listPage(10, 20);
        assertNotNull(customers10_20);
        assertEquals(5, customers10_20.size());
    }

    @Test
    public void testListPageByExample() {

        CustomerExample example = new CustomerExample();
        SearchParameters parameters = new SearchParameters();
        parameters.setFirstResult(0);
        parameters.setMaxResults(10);
        parameters.setSortProperty("firstName");
        parameters.setAscending(true);
        assertEquals(10, customerDao.findByExample(example, parameters).size());
        //assertEquals(10, customerDao.listPageByExample(example, 0, 10, "firstName", true).size());

        customerDao.add(new Customer("John", "Thebuyer", date(), 100));
        customerDao.add(new Customer("Rosa", "Thebuyer", date(), 101));
        flush();
        clear();

        example.setLastName("Thebuyer");
        assertEquals(2, customerDao.findByExample(example, parameters).size());
        //assertEquals(2, customerDao.listPageByExample(example, 0, 10, "firstName", true).size());
    }
}
