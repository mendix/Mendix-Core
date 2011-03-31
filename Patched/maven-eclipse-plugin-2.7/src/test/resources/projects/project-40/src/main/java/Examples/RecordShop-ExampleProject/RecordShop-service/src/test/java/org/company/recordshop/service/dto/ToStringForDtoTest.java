package org.company.recordshop.service.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToStringForDtoTest {

	@Test
	public void testToStringWithNullProperties() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.clear();
		assertEquals(
				"org.company.recordshop.service.dto.SimpleCustomerDto"
						+ "[id=null,version=null,customerNr=null,lastName=null,firstName=null,"
						+ "blackListed=null,username=null,sexe=null,birthDate=null]",
				customer.toString());
	}

	@Test
	public void testToStringWithSomeProperties() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.clear();
		customer.setBlackListed(true);
		assertEquals(
				"org.company.recordshop.service.dto.SimpleCustomerDto"
						+ "[id=null,version=null,customerNr=null,lastName=null,firstName=null,"
						+ "blackListed=true,username=null,sexe=null,birthDate=null]",
				customer.toString());
	}

	@Test
	public void testToStringWithIdAndVersion() {
		SimpleCustomerDto customer = new SimpleCustomerDto(1L, 0);
		assertEquals(
				"org.company.recordshop.service.dto.SimpleCustomerDto[id=1,version=0,"
						+ "customerNr=null,lastName=null,firstName=null,"
						+ "blackListed=false,username=null,sexe=MALE,birthDate=null]",
				customer.toString());
	}

	@Test
	public void testToStringWithOrders() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.clear();
		OrderNumberAndDateDto order = new OrderNumberAndDateDto();
		order.clear();
		order.setOrderNumber("1");
		customer.addToOrders(order);
		assertEquals(
				"org.company.recordshop.service.dto.SimpleCustomerDto["
						+ "id=null,version=null,customerNr=null,lastName=null,firstName=null,"
						+ "blackListed=null,username=null,sexe=null,birthDate=null]",
				customer.toString());
	}
}
