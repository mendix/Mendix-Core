package org.company.recordshop.service.dto.translators;

import java.lang.reflect.Field;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.ConcurrentUpdateException;

/**
 * Tests the optimistic locking functionality of the DTO translators.
 */
public class OptimisticLockingTest {

	/**
	 * Test the scenario that the dto contains a version but the domain object
	 * does not.
	 */
	@Test(expected = ConcurrentUpdateException.class)
	public void nullTarget() {
		// 'random' DTO translator
		FullCustomerDtoTranslator fullCustomerDtoTranslator = new FullCustomerDtoTranslator();

		Customer target = new Customer("a", "b", new DateTime(), 0);
		FullCustomerDto source = new FullCustomerDto(null, 1);
		source.setCustomerNr(1);
		source.setFirstName("Vincent");
		source.setLastName("van Gogh");
		source.setBirthDate(new DateTime("1953-03-30"));
		fullCustomerDtoTranslator.fromDto(source, target);
	}

	/**
	 * Test the scenario that the dto contains a version that is higher then the
	 * most recent version from the domain layer.
	 * 
	 * @throws Exception
	 */
	@Test(expected = ConcurrentUpdateException.class)
	public void tooHighVersion() throws Exception {
		// 'random' DTO translator
		FullCustomerDtoTranslator fullCustomerDtoTranslator = new FullCustomerDtoTranslator();

		Customer target = new Customer("a", "b", new DateTime(), 0);
		setField(target, "version", 0);
		FullCustomerDto source = new FullCustomerDto(null, 1);
		source.setCustomerNr(1);
		source.setFirstName("Vincent");
		source.setLastName("van Gogh");
		source.setBirthDate(new DateTime("1953-03-30"));
		fullCustomerDtoTranslator.fromDto(source, target);
	}

	/**
	 * Test the scenario that the domain object contains a version but the dto
	 * does not.
	 * 
	 * @throws Exception
	 */
	@Test(expected = ConcurrentUpdateException.class)
	public void testNullSource() throws Exception {
		// 'random' DTO translator
		FullCustomerDtoTranslator fullCustomerDtoTranslator = new FullCustomerDtoTranslator();

		Customer target = new Customer("a", "b", new DateTime(), 1);
		setField(target, "id", 0L);
		setField(target, "version", 0);
		FullCustomerDto source = new FullCustomerDto(0L, null);
		source.setCustomerNr(1);
		source.setFirstName("Vincent");
		source.setLastName("van Gogh");
		source.setBirthDate(new DateTime("1953-03-30"));
		fullCustomerDtoTranslator.fromDto(source, target);
	}

	/**
	 * Test the scenario that the domain object contains a version equal to the
	 * dto.
	 * 
	 * @throws Exception
	 *             Not expected.
	 */
	@Test
	public void equals() throws Exception {
		// 'random' DTO translator
		FullCustomerDtoTranslator fullCustomerDtoTranslator = new FullCustomerDtoTranslator();

		Customer target = new Customer("a", "b", new DateTime(), 0);
		setField(target, "id", 0L);
		setField(target, "version", 2);
		FullCustomerDto source = new FullCustomerDto(0L, 2);
		// FIXME because the null checks are in the translator (should not be
		// there)
		source.setCustomerNr(34);
		source.setFirstName("a");
		source.setLastName("a");
		source.setBirthDate(new DateTime());
		fullCustomerDtoTranslator.fromDto(source, target);
	}

	private void setField(Object object, String name, Object value)
			throws Exception {
		Class<?> clazz = object.getClass();
		while (!clazz.getSuperclass().equals(Object.class)) {
			clazz = clazz.getSuperclass();
		}
		Field idField = clazz.getDeclaredField(name);
		idField.setAccessible(true);
		idField.set(object, value);
	}
}
