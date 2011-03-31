package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.bd.domain.Derived;
import org.company.recordshop.service.dto.DerivedDto;
import org.joda.time.DateTime;
import org.junit.Test;

public class DerivedDtoTranslatorTest {

	private DerivedDtoTranslator translator = new DerivedDtoTranslator();

	/**
	 * All properties of the Derived domain class are derived, so the setters
	 * have no effect. The
	 * {@link DerivedDtoTranslator#fromDto(DerivedDto, Derived)} method must not
	 * call setters for derived properties that are not writable.
	 */
	@Test
	public void testFromDto() {
		DerivedDto dto = new DerivedDto();
		//dto.setFirst("second");
		dto.setSecondo(false);
		//dto.setThird(new DateTime(4));
		dto.setFourth(5);
		//dto.setFifth(6.0F);
		Derived target = translator.fromDto(dto);
		assertEquals("first", target.getFirst());
		assertEquals(true, target.isSecondo());
		assertEquals(new DateTime(3), target.getThird());
		assertEquals(4, target.getFourth().intValue());
		assertEquals(5.0F, target.getFifth(), 0.0D);
	}

	@Test
	public void testToDto() {
		DerivedDto dto = translator.toDto(new Derived());
		//assertEquals("first", dto.getFirst());
		assertTrue(dto.isSecondo());
		//assertEquals(new DateTime(3), dto.getThird());
		assertEquals(4L, dto.getFourth().intValue());
		//assertEquals(5.0F, dto.getFifth(), 0.0D);
	}
}
