package org.company.recordshop.bd.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class OrderedOneToManyAssociationTest {

    private One2ManyFrom from;

    private One2ManyOrderedTo one, two, three;

    @Before
    public void setUp() throws Exception {
        from = new One2ManyFrom("thing");
        one = new One2ManyOrderedTo("one");
        two = new One2ManyOrderedTo("two");
        three = new One2ManyOrderedTo("three");
    }

    @Test
    public void testOrderedOneTwoThree() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());

//        assertEquals(one.getSource(), from);
//        assertEquals(two.getSource(), from);
//        assertEquals(three.getSource(), from);

//        from.removeFromTarget(0);
//        assertEquals("two", from.getTarget().get(0).getProperty());
//        assertEquals("three", from.getTarget().get(1).getProperty());
//        assertEquals(one.getSource(), null);
    }

    @Test
    public void testOrderedThreeOneTwo() {
        from.addToTarget(three);
        from.addToTarget(one);
        from.addToTarget(two);
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("one", from.getTarget().get(1).getProperty());
        assertEquals("two", from.getTarget().get(2).getProperty());
    }

//    @Test
//    public void testOrderedBiDirectionalOneTwoThree() {
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(two);
//        from.addToTargetBiDirectional(three);
//        assertEquals("one", from.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("two", from.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("three", from.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalThreeOneTwo() {
//        from.addToTargetBiDirectional(three);
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(two);
//        assertEquals("three", from.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("one", from.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("two", from.getTargetBiDirectional().get(2).getProperty());
//    }

    @Test
    public void testRemoveFromTarget() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        from.removeFromTarget(two);

        assertEquals(2, from.getTarget().size());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());

        from.addToTarget(two);
        from.removeFromTarget(one);
        assertEquals(2, from.getTarget().size());
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementMiddle() {
        from.addToTarget(one);
        from.addToTarget(three);
        from.addToTarget(1, two);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementEnd() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(from.getTarget().size(), three);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementStart() {
        from.addToTarget(two);
        from.addToTarget(three);
        from.addToTarget(0, one);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementOutOfBounds() {
        from.addToTarget(two);
        from.addToTarget(three);
        try {
            from.addToTarget(-1, one);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            from.addToTarget(3, one);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
    
    @Test
    public void testRemoveIndexedFromTarget() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        from.removeFromTarget(1);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());
    }
    
    @Test
    public void testSetInTarget() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        One2ManyOrderedTo twoAndAHalf = new One2ManyOrderedTo();
        twoAndAHalf.setProperty("twoAndAHalf");
        One2ManyOrderedTo previous = from.setTarget(1, twoAndAHalf);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("twoAndAHalf", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
        assertEquals("two", previous.getProperty());
        
    }
}
