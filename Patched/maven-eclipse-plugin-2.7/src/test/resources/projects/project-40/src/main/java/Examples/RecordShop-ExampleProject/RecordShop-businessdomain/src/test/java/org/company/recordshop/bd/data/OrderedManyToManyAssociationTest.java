package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.bd.data.Many2ManyFromDao;
import org.company.recordshop.bd.data.Many2ManyOrderedToDao;
import org.company.recordshop.bd.domain.Many2ManyFrom;
import org.company.recordshop.bd.domain.Many2ManyOrderedTo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderedManyToManyAssociationTest extends AbstractDaoTestCase {

	@Autowired
	private Many2ManyFromDao fromDao;
	
	@Autowired
	private Many2ManyOrderedToDao toDao;
	
	private Many2ManyFrom from;
	private Many2ManyOrderedTo one, two, three;

	@Before
	public void setUp() throws Exception {
		from = fromDao.retrieve(fromDao.add(new Many2ManyFrom("thing")));
		one = toDao.retrieve(toDao.add(new Many2ManyOrderedTo("one")));
		two = toDao.retrieve(toDao.add(new Many2ManyOrderedTo("two")));
		three = toDao.retrieve(toDao.add(new Many2ManyOrderedTo("three")));
		flush();
	}

	@Test
	public void testOrderedOneTwoThree() {
		from.addToTarget(one);
		from.addToTarget(two);
		from.addToTarget(three);
		flush();
		clear();
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
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
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
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
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
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
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
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
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
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
		
		Many2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("one", result.getTarget().get(0).getProperty());
		assertEquals("three", result.getTarget().get(1).getProperty());
		assertEquals("two", result.getTarget().get(2).getProperty());
	}

	/** @Test
	 * Bidirectional ordered not supported (yet) 
	 */
//	public void testOrderedBiDirectionalOneTwoThree() {
//		from.addToTargetBiDirectional(one);
//		from.addToTargetBiDirectional(two);
//		from.addToTargetBiDirectional(three);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
//	}

//	@Test
//	public void testOrderedBiDirectionalTwoThreeOne() {
//		from.addToTargetBiDirectional(two);
//		from.addToTargetBiDirectional(three);
//		from.addToTargetBiDirectional(one);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
//	}

//	@Test
//	public void testOrderedBiDirectionalThreeOneTwo() {
//		from.addToTargetBiDirectional(three);
//		from.addToTargetBiDirectional(one);
//		from.addToTargetBiDirectional(two);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
//	}

//	@Test
//	public void testOrderedBiDirectionalThreeTwoOne() {
//		from.addToTargetBiDirectional(three);
//		from.addToTargetBiDirectional(two);
//		from.addToTargetBiDirectional(one);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
//	}

//	@Test
//	public void testOrderedBiDirectionalTwoOneThree() {
//		from.addToTargetBiDirectional(two);
//		from.addToTargetBiDirectional(one);
//		from.addToTargetBiDirectional(three);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
//	}

//	@Test
//	public void testOrderedBiDirectionalOneThreeTwo() {
//		from.addToTargetBiDirectional(one);
//		from.addToTargetBiDirectional(three);
//		from.addToTargetBiDirectional(two);
//		flush();
//		clear();
//		
//		Many2ManyFrom result = fromDao.retrieve(from.getId());
//		assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
//		assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
//		assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
//	}

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
