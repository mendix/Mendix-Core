package org.company.recordshop.bd.domain.businessrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.businessrules.OneEarDiscount;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;

/**
 * @author Johan Vogelzang
 */
public class OneEarDiscountBusinessRuleValidationTest {

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	/**
     * Test method for {@link OneEarDiscount}. According to the oneEarDiscount BusinessRule, a
     * Customer with one ear must have a discountPercentage of 50.
     */
    @Test
    public void testOneEarDiscountSucceed() {
        
        Customer johannes = new Customer("Johannes", "Vermeer", date(), 1);
        johannes.setDiscountPercentage(0);
        johannes.setNumberOfEars(2);
        Customer vincent = new Customer("Vincent", "Van Gogh", date(), 1);
        vincent.setDiscountPercentage(50);
        vincent.setNumberOfEars(1);
        assertEquals(0, johannes.getDiscountPercentage().intValue());
        assertEquals(50, vincent.getDiscountPercentage().intValue());
    }
    
    @Test
    public void testOneEarDiscountFail() {
        
        Customer customer = new Customer("Vincent", "Van Gogh", date(), 1);
               
        try {
            customer.setDiscountPercentage(0);
            customer.setNumberOfEars(1);
            fail("A discuontPercentage of 0 for a customer with one ear is not allowed.");
        } catch (BusinessRuleException e) {
            assertEquals(true, e.getMessage().contains("discountPercentage for Customers with one ear should be 50, but was 0"));
        }
    } 

}
