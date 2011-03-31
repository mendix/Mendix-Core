package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.SexeEnumDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class FullCustomerDtoTranslatorTest {

	private FullCustomerDtoTranslator scTranslator = new FullCustomerDtoTranslator();

	@Test
	public void testCreateNewFromDtoSucceed() {

		FullCustomerDto fullCustDto = new FullCustomerDto();
		fullCustDto.setFirstName("Vincent");
		fullCustDto.setLastName("Van Gogh");
		fullCustDto.setCustomerNr(1234);
		fullCustDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		fullCustDto.setSexe(SexeEnumDto.MALE);

		Customer newCust = scTranslator.fromDto(fullCustDto);
		assertTrue("Firstname of Customer should be Vincent.", newCust
				.getFirstName().equals("Vincent"));
		assertTrue("CustomerNr should be 1234", newCust.getCustomerNr() == 1234);
		assertTrue(
				"Associations dto's in dto's are not translated so Orders should be empty.",
				newCust.getOrders().isEmpty());

	}

	/**
	 * Tests if translation of illegal attribute value results in an
	 * BusinessRuleExveption.
	 */
	@Test
	public void testTranslateFromDtoFail() {
		FullCustomerDto fullCustDto = new FullCustomerDto();
		fullCustDto.setFirstName("Vincent");
		fullCustDto.setLastName("Van Gogh");
		fullCustDto.setCustomerNr(1234);
		fullCustDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		fullCustDto.setDiscountPercentage(-1); // Illegal
		try {
			scTranslator.fromDto(fullCustDto);
			fail("Expected BusinessRuleException");
		} catch (BusinessRuleException e) {
			Errors errors = (Errors) e.getCause();
			assertEquals(1, errors.getErrorCount());
			assertEquals(1, errors.getFieldErrorCount());
			FieldError error = errors.getFieldError();
			assertNotNull(error);
			assertEquals(2, error.getArguments().length);
			assertEquals(0L, error.getArguments()[0]);
			assertEquals(-1L, error.getArguments()[1]);
			assertEquals("discountPercentage", error.getField());
			assertEquals("field.value.min.customer.discountPercentage", error
					.getCodes()[0]);
			assertEquals("field.value.min.discountPercentage",
					error.getCodes()[1]);
			assertEquals("field.value.min.java.lang.Integer",
					error.getCodes()[2]);
			assertEquals("field.value.min", error.getCodes()[3]);
			assertEquals(-1, error.getRejectedValue());
			assertEquals("customer", error.getObjectName());
		}
	}
	
	
	/**
     * Tests if translation of multiple illegal attribute values results in an
     * BusinessRuleExveption.
     */
    @Test
    public void testTranslateFromDtoFailByMultipleErrors() {
        FullCustomerDto fullCustDto = new FullCustomerDto();
        fullCustDto.setFirstName("Vincent");
        fullCustDto.setLastName("Van Gogh");
        fullCustDto.setCustomerNr(1234);
        fullCustDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        fullCustDto.setDiscountPercentage(-1); // Illegal, must be between 0 and 100
        fullCustDto.setNumberOfEars(5); // Illegal, max 4 is allowed.
        
        try {
            scTranslator.fromDto(fullCustDto);
            fail("Expected BusinessRuleException");
            
        } catch (BusinessRuleException e) {
            
            Errors errors = (Errors) e.getCause();
            assertEquals(2, errors.getErrorCount());
            assertEquals(2, errors.getFieldErrorCount());
            
            // numberOfEars violation
            FieldError error1 = errors.getFieldError("numberOfEars");
            assertNotNull(error1);
            assertEquals(2, error1.getArguments().length);
            assertEquals(4L, error1.getArguments()[0]);
            assertEquals(5L, error1.getArguments()[1]);
            assertEquals("numberOfEars", error1.getField());
            assertEquals("field.value.max.customer.numberOfEars", error1
                    .getCodes()[0]);
            assertEquals("field.value.max.numberOfEars",
                    error1.getCodes()[1]);
            assertEquals("field.value.max.java.lang.Integer",
                    error1.getCodes()[2]);
            assertEquals("field.value.max", error1.getCodes()[3]);
            assertEquals(5, error1.getRejectedValue());
            assertEquals("customer", error1.getObjectName());
            
            //discountPercentage violation
            FieldError error2 = errors.getFieldError("discountPercentage");
            assertNotNull(error2);
            assertEquals(2, error2.getArguments().length);
            assertEquals(0L, error2.getArguments()[0]);
            assertEquals(-1L, error2.getArguments()[1]);
            assertEquals("discountPercentage", error2.getField());
            assertEquals("field.value.min.customer.discountPercentage", error2
                    .getCodes()[0]);
            assertEquals("field.value.min.discountPercentage",
                    error2.getCodes()[1]);
            assertEquals("field.value.min.java.lang.Integer",
                    error2.getCodes()[2]);
            assertEquals("field.value.min", error2.getCodes()[3]);
            assertEquals(-1, error2.getRejectedValue());
            assertEquals("customer", error2.getObjectName());
        }
    }

}
