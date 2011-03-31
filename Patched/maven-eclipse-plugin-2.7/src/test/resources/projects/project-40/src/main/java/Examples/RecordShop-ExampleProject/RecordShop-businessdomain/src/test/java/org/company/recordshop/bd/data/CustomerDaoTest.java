package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.company.recordshop.bd.data.AddressDao;
import org.company.recordshop.bd.data.ArtistDao;
import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.domain.Address;
import org.company.recordshop.bd.domain.AddressExample;
import org.company.recordshop.bd.domain.Artist;
import org.company.recordshop.bd.domain.ArtistExample;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.CustomerExample;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.OrderLine;
import org.company.recordshop.bd.domain.SexeEnum;
import org.hibernate.exception.ConstraintViolationException;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Jos Warmer
 * @author Eric Jan Malotaux
 */
public class CustomerDaoTest extends AbstractDaoTestCase {

	private Long rembrandtId;
	private Long saskiaId;
	private Long paulusId;

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private AddressDao addressDao;

	@Autowired
	private ArtistDao artistDao;

	protected DateTime date() {
		return new DateTime("2008-11-06");
	}

	@Before
	public void setUp() {
		rembrandtId = customerDao.add(new Customer("Rembrandt", "van Rijn",
				new DateTime("1606-07-15"), 3));
		saskiaId = customerDao
				.add(new Customer("Saskia", "van Rijn", date(), 4));
		Customer paulus = new Customer("Paulus", "Potter", date(), 5);
		paulus.setBlackListed(true);
		paulusId = customerDao.add(paulus);
		flush();
		clear();
	}

	/**
	 * Test method for {@link CustomerDao#retrieve(int)}.
	 */
	@Test
	public void testRetrieve() {
		Customer rembrandt = customerDao.retrieve(rembrandtId);
		assertEquals("Rembrandt", rembrandt.getFirstName());
		assertEquals("van Rijn", rembrandt.getLastName());
		assertEquals(3, rembrandt.getCustomerNr().intValue());
		assertEquals(new DateTime("1606-07-15"), rembrandt.getBirthDate());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRetrieveWithNullId() {
		customerDao.retrieve(null);
	}

	/**
	 * Test method for {@link CustomerDao#add(Customer)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		Customer customer = new Customer("Johannes", "Vermeer", date(), 222);
		customerDao.add(customer);
		flush();
		clear();

		assertEquals(4, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		assertEquals(222, simpleJdbcTemplate.queryForInt(
				"select customer_nr from Customer_TABLE where id = ?", customer
						.getId()));
	}

	/**
	 * Test method for {@link CustomerDao#update(Customer)}.
	 */
	@Test
	public void testUpdate() {
		Customer customer = new Customer("Vincent", "van Gogh", date(), 1);
		customer.setCustomerNr(1);
		customerDao.add(customer);
		Customer saved = null;
		assertNotNull(saved = customerDao.retrieve(customer.getId()));
		assertEquals("Vincent", saved.getFirstName());
		assertEquals("van Gogh", saved.getLastName());
		assertEquals(2, saved.getNumberOfEars().intValue());
		assertEquals(1, saved.getCustomerNr().intValue());
		assertEquals(false, saved.isBlackListed());
		assertEquals(0, saved.getOrders().size());

		saved.setFirstName("Thea");
		saved.setBlackListed(true);
		saved.setSexe(SexeEnum.FEMALE);
		saved.setCustomerNr(2);
		saved.setNumberOfEars(2);
		saved.setLastName("Engelhard");
		flush();

		Customer updated = customerDao.retrieve(saved.getId());
		assertEquals("Thea", updated.getFirstName());
		assertEquals("Engelhard", updated.getLastName());
		assertEquals(SexeEnum.FEMALE, updated.getSexe());
		assertEquals(2, updated.getNumberOfEars().intValue());
		assertEquals(2, updated.getCustomerNr().intValue());
		assertEquals(true, updated.isBlackListed());
		assertEquals(0, updated.getOrders().size());
	}

	/**
	 * Test method for {@link CustomerDao#delete(Customer)}.
	 */
	@Test
	public void testDelete() {
		assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		customerDao.delete(new Customer("Piet", "Paaltjens", date(), 6));
		assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		customerDao.delete(customerDao.retrieve(rembrandtId));
		flush();
		assertEquals(2, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		customerDao.delete(customerDao.retrieve(saskiaId));
		flush();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		customerDao.delete(customerDao.retrieve(paulusId));
		flush();
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
	}

	/**
	 * Basic Collection pattern test (inverse="true"). Test method for deleting
	 * a customer with orders added. </br> Model code:
	 * <code>association Customer customer one <-> many Order orders;</code>
	 * </br> Its a bi-directional one-to-many relation without notion of
	 * composite- or aggregate-root concept. Tests when a Customer with an
	 * existing order is deleted, an ConstraintViolationException is thrown.
	 */
	@Test
	@ExpectedException(ConstraintViolationException.class)
	public void testDeleteWithOrders() {
		Customer customer = new Customer("John", "Stayshort", new DateTime(
				"1980-01-01"), 12345);
		Order order = new Order("54321");
		customer.addToOrders(order);
		customerDao.add(customer);
		flush();
		clear();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Order_TABLE"));
		customerDao.delete(customer);
		flush();
		fail("Expected a ConstraintViolationException");
		/*
		 * DELETE on table 'CUSTOMER_TABLE' caused a violation of foreign key
		 * constraint 'FK75A2F39DAE33DD38' for key (557056)
		 */
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDeleteNull() {
		customerDao.delete(null);
	}

	/**
	 * Test method for {@link CustomerDao#update(Customer)} with orders added.
	 */
	@Test
	public void testAddWithOrders() {
		Customer customer = new Customer("Johannes", "Vermeer", date(), 2);

		Order order = new Order("AA111");
		order.addToOrderLines(new OrderLine(1, "verf"));
		order.addToOrderLines(new OrderLine(2, "kwast"));
		order.addToOrderLines(new OrderLine(3, "doek"));
		customer.addToOrders(order);

		order = new Order("AA222");
		order.addToOrderLines(new OrderLine(7, "rood"));
		order.addToOrderLines(new OrderLine(8, "penseel"));
		order.addToOrderLines(new OrderLine(9, "ezel"));
		customer.addToOrders(order);

		customerDao.add(customer);
		flush();

		Customer saved = customerDao.retrieve(customer.getId());
		Set<Order> savedOrders = saved.getOrders();
		assertEquals(2, savedOrders.size());

		int sum;
		for (Order o : savedOrders) {
			if (o.getOrderNumber().equals("AA111")) {
				ArrayList<OrderLine> lines = new ArrayList<OrderLine>(o
						.getOrderLines());
				assertEquals(3, lines.size());
				sum = 0;
				for (OrderLine line : lines) {
					sum = sum + line.getLineNumber();
				}
				assertEquals(6, sum); // 1+2+3
			}
			if (o.getOrderNumber().equals("AA222")) {
				ArrayList<OrderLine> lines = new ArrayList<OrderLine>(o
						.getOrderLines());
				assertEquals(3, lines.size());
				sum = 0;
				for (OrderLine line : lines) {
					sum = sum + line.getLineNumber();
				}
				assertTrue(sum == 24); // 7+8+9
			}
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddWithNullObject() {
		customerDao.add(null);
	}

	@Test
	public void testCountByExample() {
		CustomerExample example = new CustomerExample();
		example.setLastName("Rijn");
		assertEquals(2, customerDao.countByExample(example));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountByNullExample() {
		customerDao.countByExample(null);
	}

	@Test
	public void testFindByExample() {
		CustomerExample example = new CustomerExample();
		List<Customer> result = customerDao.findByExample(example);
		assertEquals(3, result.size());

		example = new CustomerExample();
		example.setBlackListed(true);
		result = customerDao.findByExample(example);
		assertEquals(1, result.size());

		example = new CustomerExample();
		example.setBlackListed(false);
		result = customerDao.findByExample(example);
		assertEquals(2, result.size());

		example = new CustomerExample();
		example.setFirstName("Rembrandt");
		Customer customer = customerDao.findByExample(example).get(0);
		assertEquals(3, customer.getCustomerNr().intValue());

		example = new CustomerExample();
		example.setFirstName("rEMBRANDT");
		customer = customerDao.findByExample(example).get(0);
		assertEquals(3, customer.getCustomerNr().intValue());

		example = new CustomerExample();
		example.setFirstName("Rem");
		customer = customerDao.findByExample(example).get(0);
		assertEquals(3, customer.getCustomerNr().intValue());

		example = new CustomerExample();
		example.setFirstName(null);
		example.setLastName("Rij");
		customer = customerDao.findByExample(example).get(0);
		assertEquals(3, customer.getCustomerNr().intValue());
		customer = customerDao.findByExample(example).get(1);
		assertEquals(4, customer.getCustomerNr().intValue());

		example.setFirstName("mbr");
		customer = customerDao.findByExample(example).get(0);
		assertEquals(3, customer.getCustomerNr().intValue());

		example = new CustomerExample();
		example.setBlackListed(null);
		example.setCustomerNr(5);
		customer = customerDao.findByExample(example).get(0);
		assertEquals(5, customer.getCustomerNr().intValue());
	}

	@Test
	public void testFindByExampleWithStringDate() {
		CustomerExample example = new CustomerExample();
		example.setBirthDate(new DateTime("1606-07-15"));
		List<Customer> result = customerDao.findByExample(example);
		assertEquals(1, result.size());
	}

	@Test
	public void testFindByExampleWithDate() {
		CustomerExample example = new CustomerExample();
		example.setBirthDate(new DateTime("1606-07-15"));
		List<Customer> result = customerDao.findByExample(example);
		assertEquals(1, result.size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindByExampleWithNullObject() {
		customerDao.findByExample(null);
	}

	@Test
	public void testFindCustomerByExampleWithAddress() {
		Address ringwade = new Address("Ringwade", "1", "12345-1234",
				"Nieuwegein");
		addressDao.add(ringwade);
		Customer rembrandt = customerDao.retrieve(rembrandtId);
		rembrandt.setInvoiceAddress(ringwade);
		flush();
		clear();

		CustomerExample customer = new CustomerExample();
		AddressExample address = new AddressExample();
		address.setCity("Nieuwegein");
		customer.setInvoiceAddress(address);

		List<Customer> customers = customerDao.findByExample(customer);
		assertEquals(1, customers.size());
	}

	/**
	 * Test that the
	 * {@link CustomerServiceModelDomainService#listCustomers(int, int, String, boolean)}
	 * method throws an IllegalArgumentException when the property argument is
	 * null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testListCustomersNullProperty() {
		customerDao.listPage(0, 0, null, true);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testListPageCustomersNullCustomer() {
		customerDao.findByExample(null, null);
	}

	public class CustomerComparator implements Comparator<Customer> {
		public int compare(Customer one, Customer other) {
			return (one.getFirstName() + one.getLastName()).compareTo(other
					.getFirstName()
					+ other.getLastName());
		}
	}

	public class OrderlineComparator implements Comparator<OrderLine> {
		public int compare(OrderLine one, OrderLine other) {
			return one.getLineNumber() - other.getLineNumber();
		}
	}
}
