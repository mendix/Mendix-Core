package org.company.recordshop.bd.domain.businessrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Order;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;

/**
 * @author Johan Vogelzang
 */
public class OrderDateDeliveryDateBusinessRuleValidationTest {

    @Test
    public void testOrderDateBeforeDeliveryDateSucceed() {

        Order order = new Order("123456789");

        try {
            order.setOrderDate(new DateTime());
            order.setDeliveryDateTime(new DateTime());

        } catch (BusinessRuleException e) {
            fail("No BusinessRuleException should be thrown." + e.getMessage());
        }
    }
    
    @Test
    public void testOrderDateBeforeDeliveryDateFail() {

        Order order = new Order("123456789");

        try {
            order.setDeliveryDateTime(new DateTime(1));
            order.setOrderDate(new DateTime(2));
            fail("A BusinessRuleException should be thrown!");
        
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("may not preceed orderDate"));
        }
    }
    
    @Test
    public void testOrderDateBeforeDeliveryDateFailAfterActivateValidation() {

        Order order = new Order("123456789");

        try {
            order.activateValidation(false);
            
            order.setDeliveryDateTime(new DateTime(1));
            order.setOrderDate(new DateTime(2));
            assertTrue(true);
            
            order.activateValidation(true);
            fail("A BusinessRuleException should be thrown!");
        
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("may not preceed orderDate"));
        }
    }

}
