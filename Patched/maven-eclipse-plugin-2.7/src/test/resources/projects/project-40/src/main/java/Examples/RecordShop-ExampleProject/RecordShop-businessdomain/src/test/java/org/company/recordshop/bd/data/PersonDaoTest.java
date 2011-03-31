package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.data.PersonDao;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Person;
import org.company.recordshop.bd.domain.SexeEnum;
import org.hibernate.exception.ConstraintViolationException;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Eric Jan Malotaux
 */
public class PersonDaoTest extends AbstractDaoTestCase {

	@Autowired
	private PersonDao personDao;

	@Autowired
	private CustomerDao customerDao;

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	@Test
	public void testRetrieve() {
		Person person = new Person("Johannes", "Vermeer", date());
		personDao.add(person);
		flush();
		assertEquals("Johannes", simpleJdbcTemplate.queryForObject(
				"select first_Name from person_table where id = ?",
				String.class, person.getId()));
		assertEquals("Vermeer", simpleJdbcTemplate.queryForObject(
				"select last_Name from person_table where id = ?",
				String.class, person.getId()));
		assertEquals("Vermeer", simpleJdbcTemplate.queryForObject(
				"select last_name from person_table where id = ?",
				String.class, person.getId()));
	}

	/**
	 * Test method for {@link PersonDao#add(Customer)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person pers = new Person("Johannes", "Vermeer", date());
		personDao.add(pers);
		flush();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		assertEquals("Vermeer", simpleJdbcTemplate.queryForObject(
				"select last_name from person_table where id = ?",
				String.class, pers.getId()));
	}

	/**
	 * Testmethod for {@link PersonDao#delete(Person)}.
	 */
	@Test
	public void testDelete() {
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person person = new Person("Rembrandt", "van Rhijn", date());
		personDao.add(person);
		flush();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person saved = personDao.retrieve(person.getId());
		personDao.delete(saved);
		flush();
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
	}

	/**
	 * Testmethod for {@link PersonDao#update(Person)}.
	 */
	@Test
	public void testUpdate() {
		Person person = new Person("Rembrandt", "van Rhijn", date());
		personDao.add(person);
		flush();
		Person saved = personDao.retrieve(person.getId());
		saved.setFirstName("Paula");
		saved.setLastName("Potter");
		saved.setSexe(SexeEnum.FEMALE);
		flush();
		assertEquals(1, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));

		Person updated = personDao.retrieve(person.getId());
		assertEquals("Paula", updated.getFirstName());
		assertEquals("Potter", updated.getLastName());
		assertEquals(person.getId(), saved.getId());
		assertEquals(saved.getId(), updated.getId());
	}

	@Test
	public void testVersion() {
		Person person = new Person("Rembrandt", "van Rhijn", date());
		personDao.add(person);
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		flush();
		assertEquals(0, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		person.setFirstName("First");
		flush();
		assertEquals(1, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		person.setFirstName("Second");
		flush();
		assertEquals(2, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		flush();
		/*
		 * When nothing is changed the flush does not actually update the row,
		 * and "version" is not changed.
		 */
		assertEquals(2, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
	}

	@Test
	public void testPolymorphism() {
		Person person = new Person("Rembrandt", "van Rhijn", date());
		personDao.add(person);
		Customer customer = new Customer("Simon", "de Wit", date(), 1);
		personDao.add(customer);
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		flush();
		clear();
		List<Person> persons = personDao.listAll();
		assertEquals(2, persons.size());
		Collections.sort(persons, new PersonComparator());
		assertSame(Person.class, persons.get(0).getClass());
		assertSame(Customer.class, persons.get(1).getClass());
		
		List<Customer> customers = customerDao.listAll();
		assertEquals(1, customers.size());
	}

	@Test
	public void testUniqueConstraint() {
		personDao.add(new Person("Klaas", "Vaak", date()));
		personDao.add(new Person("Klaas", "Vaak", date()));
		try {
			flush();
			fail("Expected ConstraintViolationException");
		} catch (ConstraintViolationException e) {
			assertEquals(ConstraintViolationException.class, e.getClass());
		}
	}

	public class PersonComparator implements Comparator<Person> {
		public int compare(Person one, Person other) {
			return (one.getFirstName() + one.getLastName()).compareTo(other
					.getFirstName()
					+ other.getLastName());
		}
	}
}
