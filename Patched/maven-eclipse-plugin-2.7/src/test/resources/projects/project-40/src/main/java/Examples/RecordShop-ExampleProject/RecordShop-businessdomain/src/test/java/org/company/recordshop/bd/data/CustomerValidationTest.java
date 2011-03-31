package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Customer;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Eric Jan Malotaux
 */
public class CustomerValidationTest extends AbstractDaoTestCase {

	@Autowired
	private CustomerDao customerDao;

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	/**
	 * Test method for {@link CustomerDao#add(Customer)}. This test was written
	 * because in Mod4j 1.0.0 validators are not being added to a persistent
	 * object when loaded by Hibernate.
	 */
	@Test
	public void testValidateAfterRetrieve() {
		Customer customer = new Customer("Johannes", "Vermeer", date(), 222);
		try {
			customer.setNumberOfEars(1);
			fail("Expected BusinessRuleException");
		} catch (BusinessRuleException e) {
			/**
			 * This method throws an exception because a validation is
			 * triggered. Validators are added in the minimal constructor
			 * invoked above.
			 */
		}
		try {
			customer.setUsername("12");
			fail("Expected BusinessRuleException");
		} catch (BusinessRuleException e) {
		}
		Long id = customerDao.add(customer);
		flush();
		clear();

		customer = customerDao.retrieve(id);
		/*
		 * Now the object is instantiated by Hibernate. Hibernate does not use
		 * the minimal constructor, but the default no-arg constructor. The
		 * validators must still be added, causing the exception to be thrown.
		 */
		try {
			customer.setNumberOfEars(1);
			fail("Expected BusinessRuleException");
		} catch (BusinessRuleException e) {
		}
	}
}
