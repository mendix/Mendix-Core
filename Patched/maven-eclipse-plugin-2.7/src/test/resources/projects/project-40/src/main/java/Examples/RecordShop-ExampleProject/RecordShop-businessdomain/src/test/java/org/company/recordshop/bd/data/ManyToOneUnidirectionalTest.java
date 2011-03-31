package org.company.recordshop.bd.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.bd.data.AddressDao;
import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Address;
import org.company.recordshop.bd.domain.Customer;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ManyToOneUnidirectionalTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;
    
    @Autowired
    private AddressDao addressDao;
    
    @Test
    public void addTest() {

        Customer customer = new Customer("John", "Mc Cloud", new DateTime("1970-1-1"), 1);
        Address invoiceAddress = new Address("SunnyStreet", "10", "12345-1234", "Moontown");
        customer.setInvoiceAddress(invoiceAddress);
        customerDao.add(customer);
        flush();
        clear();

        Customer saved = customerDao.retrieve(customer.getId());
        assertNotNull(saved);
        assertTrue(saved.getInvoiceAddress().getId().intValue() > 0);        
    }
    
    @Test
    public void addTest2() {

        Customer customer = new Customer("John", "Mc Cloud", new DateTime("1970-1-1"), 1);
        Address invoiceAddress = new Address("SunnyStreet", "10", "12345-1234", "Moontown");
        addressDao.add(invoiceAddress);
        customer.setInvoiceAddress(invoiceAddress);
        customerDao.add(customer);
        flush();
        clear();

        Customer saved = customerDao.retrieve(customer.getId());
        assertNotNull(saved);
        assertTrue(saved.getInvoiceAddress().getId().intValue() > 0);        
    }
}
