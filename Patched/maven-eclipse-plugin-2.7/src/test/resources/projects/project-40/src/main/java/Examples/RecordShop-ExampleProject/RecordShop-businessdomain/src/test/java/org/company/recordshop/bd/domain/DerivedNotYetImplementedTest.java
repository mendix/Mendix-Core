package org.company.recordshop.bd.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.domain.DerivedNotYetImplemented;
import org.joda.time.DateTime;
import org.junit.Test;

public class DerivedNotYetImplementedTest {

    @Test
    public void testSetFirst() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.setFirst("first");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetSecondo() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.setSecondo(true);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetThird() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.setThird(new DateTime());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetFourth() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.setFourth(4);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetFifth() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.setFifth(5.0F);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetFirst() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.getFirst();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testIsSecondo() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.isSecondo();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetThird() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.getThird();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetFourth() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.getFourth();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetFifth() {
        DerivedNotYetImplemented derived = new DerivedNotYetImplemented();
        try {
            derived.getFifth();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }
}
