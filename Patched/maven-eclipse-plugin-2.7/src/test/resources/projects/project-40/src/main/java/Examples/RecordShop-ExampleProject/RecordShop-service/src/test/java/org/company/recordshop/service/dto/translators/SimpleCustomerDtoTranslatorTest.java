package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.service.AbstractServiceTestCase;
import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.SexeEnumDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleCustomerDtoTranslatorTest extends AbstractServiceTestCase {

	@Autowired
	protected SimpleCustomerDtoTranslator simpleCustomerDtoTranslator;

	public SimpleCustomerDtoTranslator getSimpleCustomerDtoTranslator() {
		return simpleCustomerDtoTranslator;
	}

	public void setSimpleCustomerDtoTranslator(
			SimpleCustomerDtoTranslator simpleCustomerDtoTranslator) {
		this.simpleCustomerDtoTranslator = simpleCustomerDtoTranslator;
	}

	@Test
	public void testCreateNewFromDtoSucceed() {

		SimpleCustomerDto simpleCust = new SimpleCustomerDto();
		simpleCust.setFirstName("Vincent");
		simpleCust.setLastName("Van Gogh");
		simpleCust.setCustomerNr(1234);
		simpleCust.setSexe(SexeEnumDto.MALE);
		simpleCust.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));

		OrderNumberAndDateDto orderDto = new OrderNumberAndDateDto();
		orderDto.setOrderNumber("1");
		orderDto.setCustomer(simpleCust);

		simpleCust.addToOrders(orderDto);

		Customer newCust = simpleCustomerDtoTranslator.fromDto(simpleCust);
		assertEquals("Vincent", newCust.getFirstName());
		assertEquals(1234, newCust.getCustomerNr().intValue());
		assertEquals(1, newCust.getOrders().size());

	}

	@Test
	public void testCreateNewFromNullDtol() {
		try {
			simpleCustomerDtoTranslator.fromDto(null, (Customer)null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException te) {
			assertEquals("argument [source] may not be null", te.getMessage());
		}
	}

	@Test
	public void testToDtoBiderectionalSucceed() {

		Customer cust = new Customer("Herman", "Bread", new DateTime(
				"2009-11-06"), 4321);
		Order order = new Order("1111");
		cust.addToOrders(order);

		SimpleCustomerDto customerDto = simpleCustomerDtoTranslator.toDto(cust);

		assertEquals(Integer.valueOf(4321), customerDto.getCustomerNr());
		assertFalse(customerDto.getOrders().isEmpty());
		for (OrderNumberAndDateDto orderDto : customerDto.getOrders()) {
			assertEquals("1111", orderDto.getOrderNumber());
		}
	}

	@Test
	public void testFromDtoBidirectionalSucceed() throws Exception {
		CustomerRepository repository = new CustomerRepository();
		/**
		 * Create a customer dto with orders to be translated to a DO.
		 */
		SimpleCustomerDto customerDto = createCustomerDto("1853-03-30",
				"Vincent", "van Gogh", 1, new String[] { "1", "2" });

		/**
		 * Translate it to a DO and check.
		 */
		Customer customer = simpleCustomerDtoTranslator.fromDto(customerDto);
		checkCustomer(customer, new String[] { "1", "2" });

		/**
		 * "Save" the customer and retrieve. Id's will be added to all domain
		 * objects. Then transform to a DTO again.
		 */
		customer = repository.get(repository.save(customer));
		customerDto = simpleCustomerDtoTranslator.toDto(customer);

		/**
		 * Remove an order from the DTO to see if it gets removed from the DO.
		 */
		customerDto.removeFromOrders(customerDto.getFromOrders(1L));
		customer = simpleCustomerDtoTranslator.fromDto(customerDto, customer);
		checkCustomer(customer, new String[] { "2" });

		/**
		 * Add another order to the DTO to see if it gets added to the DO.
		 */
		OrderNumberAndDateDto orderDto = new OrderNumberAndDateDto();
		orderDto.setOrderNumber("3");
		orderDto.setCustomer(customerDto);
		customerDto.addToOrders(orderDto);
		customer = simpleCustomerDtoTranslator.fromDto(customerDto, customer);
		customer = repository.get(repository.save(customer));
		checkCustomer(customer, new String[] { "2", "3" });

		// TODO: Also update one or more orders.
	}

	private void checkCustomer(Customer customer, String[] orderNumbers) {
		List<Order> orders = new ArrayList<Order>(customer.getOrders());
		Collections.sort(orders, new OrderComparator());
		assertEquals(orderNumbers.length, orders.size());
		for (int i = 0; i < orderNumbers.length; i++) {
			assertEquals(orderNumbers[i], orders.get(i).getOrderNumber());
			assertEquals(customer, orders.get(i).getCustomer());
		}
	}

	private SimpleCustomerDto createCustomerDto(String birth, String first,
			String last, int number, String[] orders) {
		SimpleCustomerDto customerDto = new SimpleCustomerDto();
		customerDto.setBirthDate(new DateTime(birth));
		customerDto.setFirstName(first);
		customerDto.setLastName(last);
		customerDto.setCustomerNr(number);

		for (int i = 0; i < orders.length; i++) {
			OrderNumberAndDateDto orderDto = new OrderNumberAndDateDto();
			orderDto.setOrderNumber(orders[i]);
			orderDto.setCustomer(customerDto);
			customerDto.addToOrders(orderDto);
		}
		return customerDto;
	}

	private CustomerWithOrdersAndOrderLines createCustomerDto() {
		CustomerWithOrdersAndOrderLines result = new CustomerWithOrdersAndOrderLines();
		return result;
	}

	@Test(expected = BusinessRuleException.class)
	public void testFromDtoWithNullsFail() {
		SimpleCustomerDto custDto = new SimpleCustomerDto();
		simpleCustomerDtoTranslator.fromDto(custDto);
	}

	private class OrderComparator implements Comparator<Order> {
		public int compare(Order o1, Order o2) {
			return o1.getOrderNumber().compareTo(o2.getOrderNumber());
		}
	}

	private class CustomerRepository {
		private Map<Long, Customer> customers = new HashMap<Long, Customer>();

		Long customerId = 0L;

		Long orderId = 0L;

		public Long save(Customer customer) throws Exception {
			setId(customer, ++customerId);
			customers.put(customerId, customer);
			List<Order> orders = new ArrayList<Order>(customer.getOrders());
			Collections.sort(orders, new OrderComparator());
			for (Order order : orders) {
				setId(order, ++orderId);
			}
			return customerId;
		}

		public Customer get(Long id) throws Exception {
			Customer customer = customers.get(id);
			Customer result = new Customer(customer.getFirstName(), customer
					.getLastName(), customer.getBirthDate(), customer
					.getCustomerNr());
			setId(result, customer.getId());
			for (Order order : customer.getOrders()) {
				Order newOrder = new Order(order.getOrderNumber());
				setId(newOrder, order.getId());
				result.addToOrders(newOrder);
			}
			return result;
		}

		private void setId(Object object, Long id) throws Exception {
			Class<?> clazz = object.getClass();
			while (!clazz.getSuperclass().equals(Object.class)) {
				clazz = clazz.getSuperclass();
			}
			Field idField = clazz.getDeclaredField("id");
			idField.setAccessible(true);
			idField.set(object, id);
		}
	}
}