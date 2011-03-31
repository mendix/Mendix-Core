package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.data.DerivedDao;
import org.company.recordshop.bd.domain.Derived;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DerivedDaoTest extends AbstractDaoTestCase {

    @Autowired
    private DerivedDao dao;

    Derived read;

    @Before
    public void setUp() {
        Long id = dao.add(new Derived());
        flush();
        clear();
        read = dao.retrieve(id);
    }

    @Test
    public void testGetFirst() {
        assertEquals("first", read.getFirst());
    }

    @Test
    public void testGetSecondo() {
        assertTrue(read.isSecondo());
    }

    @Test
    public void testGetThird() {
        assertEquals(new DateTime(3), read.getThird());
    }

    @Test
    public void testGetFourth() {
        assertEquals(Integer.valueOf(4), read.getFourth());
    }

    @Test
    public void testGetFifth() {
        assertEquals(5.0F, read.getFifth(), 0.000001);
    }
    @Test
    public void testSetSecondo() {
        read.setSecondo(true);
    }

    @Test
    public void testSetFourth() {
        read.setFourth(4);
    }
}
