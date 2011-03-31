package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.company.recordshop.service.dto.DerivedDto;
import org.company.recordshop.service.local.TestSVCLocalService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSVCLocalServiceImplTest extends AbstractServiceTestCase {

    @Autowired
    TestSVCLocalService testSVCService;

    @Test
    public void testCreateDerived() {
        DerivedDto dto = new DerivedDto();
        testSVCService.createDerived(dto);
    }

    @Test
    public void testListAllDerived() {
        testSVCService.createDerived(new DerivedDto());
        List<DerivedDto> list = testSVCService.listAllDerived();
        assertEquals(1, list.size());
        DerivedDto read = list.get(0);
        // assertEquals(null, read.getFirst());
        assertTrue(read.isSecondo());
        // assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        // assertEquals(Float.valueOf(5.0F), read.getFifth());
    }

    @Test
    public void testReadDerived() {
        Long id = testSVCService.createDerived(new DerivedDto());
        DerivedDto read = testSVCService.readDerivedAsDerivedDto(id);
        // assertEquals("first", read.getFirst());
        assertTrue(read.isSecondo());
        // assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        // assertEquals(Float.valueOf(5.0F), read.getFifth());
    }

    @Test
    public void testUpdateDerived() {
        Long id = testSVCService.createDerived(new DerivedDto());
        DerivedDto read = testSVCService.readDerivedAsDerivedDto(id);
        // assertEquals("first", read.getFirst());
        assertTrue(read.isSecondo());
        // assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        // assertEquals(Float.valueOf(5.0F), read.getFifth());
        // read.setFirst("second");
        read.setSecondo(false);
        // read.setThird(new DateTime(3));
        read.setFourth(4);
        // read.setFifth(5.0F);
        testSVCService.updateDerived(read);
        DerivedDto updated = testSVCService.readDerivedAsDerivedDto(id);
        // assertEquals("first", updated.getFirst());
        assertTrue(updated.isSecondo());
        // assertEquals(new DateTime(3), updated.getThird());
        assertEquals(Integer.valueOf(4), updated.getFourth());
        // assertEquals(Float.valueOf(5.0F), updated.getFifth());
    }
}
