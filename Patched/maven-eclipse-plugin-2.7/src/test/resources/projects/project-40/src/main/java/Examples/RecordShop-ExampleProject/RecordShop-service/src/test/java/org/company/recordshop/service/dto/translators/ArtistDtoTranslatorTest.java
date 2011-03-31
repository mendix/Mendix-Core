package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.service.dto.ArtistDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistDtoTranslatorTest {

	@Autowired
	protected ArtistDtoTranslator translator = new ArtistDtoTranslator();

	@Test
	public void testFromDtoArtistDto() {
		ArtistDto source = new ArtistDto();
		try {
			translator.fromDto(source);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals(
					"This source dto does not contain all non-nullable properties"
							+ " of the domain object to be created: org.company.recordshop."
							+ "service.dto.ArtistDto[id=null,version=null,firstName=null,"
							+ "lastName=null,age=null,artistName=null]", e
							.getMessage());
		}
	}
}