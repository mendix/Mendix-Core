package org.company.recordshop.service.dto;

import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;

public class DefaultValuesTest {

	private final static String ORDER_NR = "123456789";

	/**
	 * Test method for Dto default values.
	 */
	@Test
	public void testDtoDefaultValues() {

		// Boolean & Integer defaults
		FullProductDto productDtoWithDefaults = new FullProductDto();
		assertTrue(productDtoWithDefaults.isInStock() == false);
		assertTrue(productDtoWithDefaults.getMinimalQuantity() == 1);

		// DateTime
		OrderDto order = new OrderDto();
		assertTrue(order.getOrderDate().equals(new DateTime("2009-01-01")));

		// Enumeration
		SimpleCustomerDto customer = new SimpleCustomerDto();
		assertTrue(customer.getSexe().equals(SexeEnumDto.MALE));

		// String
		FullRecordDto record = new FullRecordDto();
		assertTrue(record.getTitle().equals("Title unknown"));

		// Inject defaults by setter
		FullProductDto product = new FullProductDto();
		assertTrue(product.isInStock() == false);
		assertTrue(product.getMinimalQuantity() == 1);

		// No defaults
		FullProductDto productDtoNoDefaults = new FullProductDto();
		productDtoNoDefaults.clear();
		assertTrue(productDtoNoDefaults.isInStock() == null);
		assertTrue(productDtoNoDefaults.getMinimalQuantity() == null);
	}
}
