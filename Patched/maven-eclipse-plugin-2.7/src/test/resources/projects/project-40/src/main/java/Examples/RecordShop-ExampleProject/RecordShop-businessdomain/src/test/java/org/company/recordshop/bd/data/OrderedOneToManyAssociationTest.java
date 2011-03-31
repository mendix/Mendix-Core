package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.data.One2ManyFromDao;
import org.company.recordshop.bd.data.One2ManyOrderedToDao;
import org.company.recordshop.bd.domain.One2ManyFrom;
import org.company.recordshop.bd.domain.One2ManyOrderedTo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderedOneToManyAssociationTest extends AbstractDaoTestCase {

    @Autowired
    private One2ManyFromDao fromDao;

    @Autowired
    private One2ManyOrderedToDao toDao;

    private One2ManyFrom from;

    private One2ManyOrderedTo one, two, three;

    @Before
    public void setUp() throws Exception {
        from = fromDao.retrieve(fromDao.add(new One2ManyFrom("thing")));
        one = toDao.retrieve(toDao.add(new One2ManyOrderedTo("one")));
        two = toDao.retrieve(toDao.add(new One2ManyOrderedTo("two")));
        three = toDao.retrieve(toDao.add(new One2ManyOrderedTo("three")));
        flush();
    }

    @Test
    public void testOrderedOneTwoThree() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("one", result.getTarget().get(0).getProperty());
        assertEquals("two", result.getTarget().get(1).getProperty());
        assertEquals("three", result.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedTwoThreeOne() {
        from.addToTarget(two);
        from.addToTarget(three);
        from.addToTarget(one);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("two", result.getTarget().get(0).getProperty());
        assertEquals("three", result.getTarget().get(1).getProperty());
        assertEquals("one", result.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedThreeOneTwo() {
        from.addToTarget(three);
        from.addToTarget(one);
        from.addToTarget(two);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("three", result.getTarget().get(0).getProperty());
        assertEquals("one", result.getTarget().get(1).getProperty());
        assertEquals("two", result.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedThreeTwoOne() {
        from.addToTarget(three);
        from.addToTarget(two);
        from.addToTarget(one);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("three", result.getTarget().get(0).getProperty());
        assertEquals("two", result.getTarget().get(1).getProperty());
        assertEquals("one", result.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedTwoOneThree() {
        from.addToTarget(two);
        from.addToTarget(one);
        from.addToTarget(three);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("two", result.getTarget().get(0).getProperty());
        assertEquals("one", result.getTarget().get(1).getProperty());
        assertEquals("three", result.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedOneThreeTwo() {
        from.addToTarget(one);
        from.addToTarget(three);
        from.addToTarget(two);
        flush();
        clear();

        One2ManyFrom result = fromDao.retrieve(from.getId());
        assertEquals("one", result.getTarget().get(0).getProperty());
        assertEquals("three", result.getTarget().get(1).getProperty());
        assertEquals("two", result.getTarget().get(2).getProperty());
    }

//    @Test
//    public void testOrderedBiDirectionalOneTwoThree() {
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(two);
//        from.addToTargetBiDirectional(three);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalTwoThreeOne() {
//        from.addToTargetBiDirectional(two);
//        from.addToTargetBiDirectional(three);
//        from.addToTargetBiDirectional(one);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalThreeOneTwo() {
//        from.addToTargetBiDirectional(three);
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(two);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalThreeTwoOne() {
//        from.addToTargetBiDirectional(three);
//        from.addToTargetBiDirectional(two);
//        from.addToTargetBiDirectional(one);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalTwoOneThree() {
//        from.addToTargetBiDirectional(two);
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(three);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
//    }
//
//    @Test
//    public void testOrderedBiDirectionalOneThreeTwo() {
//        from.addToTargetBiDirectional(one);
//        from.addToTargetBiDirectional(three);
//        from.addToTargetBiDirectional(two);
//        flush();
//        clear();
//
//        One2ManyFrom result = fromDao.retrieve(from.getId());
//        assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
//        assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
//        assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
//    }

    /**
     * The removeFromTarget should work before the objects are persisted.
     */
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

    /**
     * The removeFromTarget should also work after the objects are persisted.
     */
    @Test
    public void testRemoveFromTargetPersisted() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        flush();
        clear();
        from = fromDao.retrieve(from.getId());
        two = from.getFromTarget(two.getId());
        from.removeFromTarget(two);
        assertEquals(2, from.getTarget().size());

        flush();
        clear();

        from = fromDao.retrieve(from.getId());
        assertEquals(2, from.getTarget().size());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());

        from.addToTarget(two);
        from.removeFromTarget(from.getFromTarget(one.getId()));
        flush();
        clear();

        from = fromDao.retrieve(from.getId());
        assertEquals(2, from.getTarget().size());
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementMiddle() {
        from.addToTarget(one);
        from.addToTarget(three);
        from.addToTarget(1, two);
        flush();
        clear();

        from = fromDao.retrieve(from.getId());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementEnd() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(from.getTarget().size(), three);
        flush();
        clear();

        from = fromDao.retrieve(from.getId());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementStart() {
        from.addToTarget(two);
        from.addToTarget(three);
        from.addToTarget(0, one);
        flush();
        clear();

        from = fromDao.retrieve(from.getId());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testAddToTargetIndexElementOutOfBounds() {
        from.addToTarget(two);
        from.addToTarget(three);
        flush();
        clear();

        from = fromDao.retrieve(from.getId());
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
}
