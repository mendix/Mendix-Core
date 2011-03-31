package org.company.recordshop.bd.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.domain.Derived;
import org.joda.time.DateTime;
import org.junit.Test;

public class DerivedTest {

    @Test
    public void testSetSecondo() {
        new Derived().setSecondo(true);
    }

    @Test
    public void testSetFourth() {
        new Derived().setFourth(4);
    }

    @Test
    public void testGetFirst() {
        assertEquals("first", new Derived().getFirst());
    }

    @Test
    public void testIsSecondo() {
        assertTrue(new Derived().isSecondo());
    }

    @Test
    public void testGetThird() {
        assertEquals(new DateTime(3), new Derived().getThird());
    }

    @Test
    public void testGetFourth() {
        assertEquals(Integer.valueOf(4), new Derived().getFourth());
    }

    @Test
    public void testGetFifth() {
        assertEquals(5.0F, new Derived().getFifth(), 0.000000001);
    }

}
