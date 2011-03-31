package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.data.OrderDao;
import org.company.recordshop.bd.data.OrderLineDao;
import org.company.recordshop.bd.data.PersonDao;
import org.company.recordshop.bd.data.RelationDao;
import org.company.recordshop.bd.domain.Address;
import org.company.recordshop.bd.domain.AddressExample;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.CustomerExample;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.OrderExample;
import org.company.recordshop.bd.domain.OrderLine;
import org.company.recordshop.bd.domain.OrderLineExample;
import org.hibernate.criterion.MatchMode;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mendix.runtime.queries.SearchParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

public class FindByExampleWithMultipleAssociattionsTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;
    
    @Autowired
    private OrderLineDao orderLineDao;
    
    @Autowired
    private PersonDao personDao;
    
    @Autowired
    private RelationDao relationDao;
    
    private final byte NUMBER_OF_ITEMS = 10;

    protected DateTime date() {
        return new DateTime(2008, 11, 6, 0, 0, 0, 0);
    }

    /**
     * Data initialization
     * Adds x customers with each x orders containing x order lines.
     */
    @Before
    public void setUp() {

        for (int i = 1; i <= NUMBER_OF_ITEMS; i++) {
            Customer customer = new Customer("Customer-" + i, "LastName", date(), i);
            Address invoiceAddress = new Address("BillingStreet", Integer.toString(i), "12345-1234", "Amsterdam");
            customer.setInvoiceAddress(invoiceAddress);
            for ( int j = 1; j <= NUMBER_OF_ITEMS; j++) {
                Order order = new Order("OrderNr-" + Integer.toString(i) + Integer.toString(j));                
                
                for ( int k = 1; k <= NUMBER_OF_ITEMS; k++) {
                    OrderLine orderLine = new OrderLine(k, "OrderLine-" + Integer.toString(i) + Integer.toString(j) + Integer.toString(k));
                    order.addToOrderLines(orderLine);
                }
                customer.addToOrders(order);
            }
            Long id = customerDao.add(customer);
            System.out.println("custid ="  + id);
            flush();
            clear();
        }
    }

    /**
     * The XDao#countByExample(example) and XDao#findByExample(example).size() methods should return the same mumber.
     */
    @Test
    public void testCountMatchesFind() {

        assertEquals(NUMBER_OF_ITEMS, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        
        CustomerExample custExample = new CustomerExample();
        assertEquals(NUMBER_OF_ITEMS, customerDao.countByExample(custExample, new SearchParameters()));
        assertEquals(NUMBER_OF_ITEMS, customerDao.findByExample(custExample, new SearchParameters()).size());        
        
        OrderExample orderExample = new OrderExample();
        assertEquals(NUMBER_OF_ITEMS * NUMBER_OF_ITEMS, orderDao.countByExample(orderExample, new SearchParameters()));
        assertEquals(NUMBER_OF_ITEMS * NUMBER_OF_ITEMS, orderDao.findByExample(orderExample, new SearchParameters()).size());  
                
        OrderLineExample orderLineExample = new OrderLineExample();
        assertEquals(NUMBER_OF_ITEMS * NUMBER_OF_ITEMS * NUMBER_OF_ITEMS, orderLineDao.countByExample(orderLineExample, new SearchParameters()));
        assertEquals(NUMBER_OF_ITEMS * NUMBER_OF_ITEMS * NUMBER_OF_ITEMS, orderLineDao.findByExample(orderLineExample, new SearchParameters()).size());
    }
    
    @Test
    public void testToOneAssociationInHierachry(){
        
        // Find all orders for customer with name = Customer-4
        OrderExample orderExample = new OrderExample();
        CustomerExample custExample = new CustomerExample();
        custExample.setFirstName("Customer-4");
        orderExample.setCustomer(custExample);
        assertEquals(NUMBER_OF_ITEMS, orderDao.findByExample(orderExample, new SearchParameters()).size());
        assertEquals(NUMBER_OF_ITEMS, orderDao.countByExample(orderExample, new SearchParameters()));
    }
    
    @Test
    public void testToOneAssociationInHierachrySpanMultipleObjects(){
        
        // Find all orders for customer with name = Customer-4 and invoiceAddress.Housenumber = 4.
        OrderExample orderExample = new OrderExample();
        CustomerExample custExample = new CustomerExample();
        AddressExample invoiceAddress = new AddressExample();
        
        invoiceAddress.setHouseNumber("4");        
        custExample.setFirstName("Customer-4");
        custExample.setInvoiceAddress(invoiceAddress);
        orderExample.setCustomer(custExample);
        assertEquals(NUMBER_OF_ITEMS, orderDao.findByExample(orderExample, new SearchParameters()).size());
        assertEquals(NUMBER_OF_ITEMS, orderDao.countByExample(orderExample, new SearchParameters()));
        
        custExample.setFirstName("DOES-NOT-EXIST");
        assertEquals(0, orderDao.findByExample(orderExample, new SearchParameters()).size());
    }
    
    @Test
    public void testToOneAssociationInHierachryFindById(){
        
        // Find all Orders for Customer 5 by id.
        OrderExample orderExample = new OrderExample();
        CustomerExample custExample = new CustomerExample();
        custExample.setCustomerNr(5);
        List<Customer> custList = customerDao.findByExample(custExample);
        
        custExample = new CustomerExample(custList.get(0).getId());
        orderExample.setCustomer(custExample);
        List<Order> orderList = orderDao.findByExample(orderExample, new SearchParameters()); 
        assertEquals(NUMBER_OF_ITEMS, orderList.size());
        
        orderExample = new OrderExample(orderList.get(0).getId());
        orderList = orderDao.findByExample(orderExample);
        assertEquals(1, orderList.size());
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
    }

    @Test
    public void testListSortedPageByExample() {

        CustomerExample example = new CustomerExample();
        SearchParameters parameters = new SearchParameters();
        parameters.setFirstResult(0);
        parameters.setMaxResults(10);
        
        parameters.setAscending(true);
        assertEquals(10, customerDao.findByExample(example, parameters).size());

        customerDao.add(new Customer("John", "Thebuyer", date(), 100));
        customerDao.add(new Customer("Rosa", "Thebuyer", date(), 101));
        flush();
        clear();

        example.setLastName("Thebuyer");
        parameters.setSortProperty("firstName");
        List<Customer> customers = customerDao.findByExample(example, parameters);
        assertEquals(2, customers.size());
        assertEquals(2, customerDao.countByExample(example, parameters));
        assertEquals("John", customers.get(0).getFirstName());
        assertEquals("Rosa", customers.get(1).getFirstName());
    }
    
    @Test
    public void findByExampleWithSearchParameters() {
        
        SearchParameters sparam = new SearchParameters();
        CustomerExample exampleDto = new CustomerExample();
        assertEquals(10, customerDao.findByExample(exampleDto, sparam).size());
        assertEquals(10, customerDao.countByExample(exampleDto));
        
        sparam.setFirstResult(5);
        sparam.setMaxResults(4);
        sparam.setIgnoreCase(false);
        sparam.setMatchMode(MatchMode.START);
                
        exampleDto.setFirstName("Customer-");
        // findByExample() applies the setFirstResult and setMaxResult values
        assertEquals(4, customerDao.findByExample(exampleDto, sparam).size());
        // contByExample() will ignore the setFirstResult and setMaxResult values
        assertEquals(10, customerDao.countByExample(exampleDto, sparam));
    }
}
