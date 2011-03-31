package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 */
public class PagingSupportCustomerServciceTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

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
            Customer customer = new Customer("Customer" + i, "Last name", date(), i);
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

        assertEquals(NUMBER_OF_ITEMS, customerServiceModelService.countCustomers());
    }

    /**
     * Test method for {@link CustomerDao#listCustomers(firstResult, maxResults)}.
     */
    @Test
    public void testListCustomersInRange() {

        List<SimpleCustomerDto> custList = customerServiceModelService.listCustomers(5, 15);
        assertEquals(10, custList.size());
    }

    /**
     * Test method for {@link CustomerDao#listCustomers(firstResult, maxResults, sortParam)}.
     */
    @Test
    public void testSortedAscendingListInRange() {

        List<SimpleCustomerDto> custList = customerServiceModelService.listCustomers(6, 5, "customerNr", true);
        assertEquals(5, custList.size());

        assertEquals(7, custList.get(0).getCustomerNr().intValue());
        assertEquals(8, custList.get(1).getCustomerNr().intValue());
        assertEquals(9, custList.get(2).getCustomerNr().intValue());
        assertEquals(10, custList.get(3).getCustomerNr().intValue());
        assertEquals(11, custList.get(4).getCustomerNr().intValue());
    }

    /**
     * Test method for {@link CustomerDao#listCustomers(firstResult, maxResults, sortParam)}.
     */
    @Test
    public void testSortedDescendingListInRange() {

        List<SimpleCustomerDto> custList = customerServiceModelService.listCustomers(6, 5, "customerNr", false);
        assertEquals(5, custList.size());

        assertEquals(9, custList.get(0).getCustomerNr().intValue());
        assertEquals(8, custList.get(1).getCustomerNr().intValue());
        assertEquals(7, custList.get(2).getCustomerNr().intValue());
        assertEquals(6, custList.get(3).getCustomerNr().intValue());
        assertEquals(5, custList.get(4).getCustomerNr().intValue());
    }
}
