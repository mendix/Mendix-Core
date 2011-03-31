package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.bd.data.ArtistDao;
import org.company.recordshop.bd.data.RecordDao;
import org.company.recordshop.bd.domain.Artist;
import org.company.recordshop.bd.domain.Record;
import org.company.recordshop.bd.domain.RecordTypeEnum;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ManyToManyAssociationTest extends AbstractDaoTestCase {

	@Autowired
	private RecordDao recordDao;
	
	@Autowired
	private ArtistDao artistDao;
	
	Record record1, record2, record3;

	Artist artist1, artist2, artist3;

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	@Before
	public void setUp() throws Exception {
		record1 = new Record("1234", 24.95F, RecordTypeEnum.BLUERAY);
		record2 = new Record("1234", 24.95F, RecordTypeEnum.BLUERAY);
		record3 = new Record("1234", 24.95F, RecordTypeEnum.BLUERAY);
		recordDao.add(record1);
		recordDao.add(record2);
		recordDao.add(record3);

		artist1 = new Artist("A1", "L1", date(), "A1");
		artist2 = new Artist("A2", "L2", date(), "A2");
		artist3 = new Artist("A3", "L3", date(), "A3");
		artistDao.add(artist1);
		artistDao.add(artist2);
		artistDao.add(artist3);
		flush();
	}
	
	private void reRead() {
		flush();
		clear();
		record1 = recordDao.retrieve(record1.getId());
		record2 = recordDao.retrieve(record2.getId());
		record3 = recordDao.retrieve(record3.getId());
		artist1 = artistDao.retrieve(artist1.getId());
		artist2 = artistDao.retrieve(artist2.getId());
		artist3 = artistDao.retrieve(artist3.getId());
	}

	@Test
	public void testAddToContributors() {
		assertEquals(0, record1.getContributors().size());
		assertEquals(0, artist1.getRecords().size());

		/**
		 * Add an artist to a record.
		 */
		record1.addToContributors(artist1);
		reRead();
		assertEquals(1, record1.getContributors().size());
		assertEquals(1, artist1.getRecords().size());
		assertTrue(record1.getContributors().contains(artist1));
		assertTrue(artist1.getRecords().contains(record1));

		/**
		 * Adding the same artist to the same record twice is idempotent.
		 */
		record1.addToContributors(artist1);
		reRead();
		assertEquals(1, record1.getContributors().size());
		assertEquals(1, artist1.getRecords().size());
		assertTrue(record1.getContributors().contains(artist1));
		assertTrue(artist1.getRecords().contains(record1));

		/**
		 * Adding a second artist to the same record.
		 */
		record1.addToContributors(artist2);
		reRead();
		assertEquals(2, record1.getContributors().size());
		assertEquals(1, artist1.getRecords().size());
		assertEquals(1, artist2.getRecords().size());
		assertTrue(record1.getContributors().contains(artist1));
		assertTrue(record1.getContributors().contains(artist2));
		assertTrue(artist1.getRecords().contains(record1));
		assertTrue(artist2.getRecords().contains(record1));

		/**
		 * Adding the first artist also to a second record.
		 */
		record2.addToContributors(artist1);
		reRead();
		assertEquals(2, record1.getContributors().size());
		assertEquals(2, artist1.getRecords().size());
		assertEquals(1, artist2.getRecords().size());
		assertTrue(record1.getContributors().contains(artist1));
		assertTrue(record1.getContributors().contains(artist2));
		assertTrue(record2.getContributors().contains(artist1));
		assertFalse(record2.getContributors().contains(artist2));
		assertTrue(artist1.getRecords().contains(record1));
		assertTrue(artist2.getRecords().contains(record1));
	}

	@Test
	public void testRemoveFromContributors() {
		record1.addToContributors(artist1);
		record1.addToContributors(artist2);
		record1.addToContributors(artist3);
		record2.addToContributors(artist1);
		record3.addToContributors(artist1);
		reRead();

		assertEquals(3, record1.getContributors().size());
		assertEquals(1, record2.getContributors().size());
		assertEquals(1, record3.getContributors().size());
		assertEquals(3, artist1.getRecords().size());
		assertEquals(1, artist2.getRecords().size());
		assertEquals(1, artist3.getRecords().size());
		assertTrue(record1.getContributors().contains(artist1));
		assertTrue(record1.getContributors().contains(artist2));
		assertTrue(record1.getContributors().contains(artist3));
		assertTrue(record2.getContributors().contains(artist1));
		assertFalse(record2.getContributors().contains(artist2));
		assertFalse(record2.getContributors().contains(artist3));
		assertTrue(record3.getContributors().contains(artist1));
		assertFalse(record3.getContributors().contains(artist2));
		assertFalse(record3.getContributors().contains(artist3));
		assertTrue(artist1.getRecords().contains(record1));
		assertTrue(artist1.getRecords().contains(record2));
		assertTrue(artist1.getRecords().contains(record3));
		assertTrue(artist2.getRecords().contains(record1));
		assertFalse(artist2.getRecords().contains(record2));
		assertFalse(artist2.getRecords().contains(record3));
		assertTrue(artist3.getRecords().contains(record1));
		assertFalse(artist3.getRecords().contains(record2));
		assertFalse(artist3.getRecords().contains(record3));

		record3.removeFromContributors(artist1);
		reRead();
		assertEquals(0, record3.getContributors().size());
		assertEquals(2, artist1.getRecords().size());
		assertFalse(record3.getContributors().contains(artist1));
		assertFalse(artist1.getRecords().contains(record3));

		record3.removeFromContributors(artist1);
		reRead();
		assertEquals(0, record3.getContributors().size());
		assertEquals(2, artist1.getRecords().size());
		assertFalse(record3.getContributors().contains(artist1));
		assertFalse(artist1.getRecords().contains(record3));

		record2.removeFromContributors(artist1);
		reRead();
		assertEquals(0, record2.getContributors().size());
		assertEquals(1, artist1.getRecords().size());
		assertFalse(record2.getContributors().contains(artist1));
		assertFalse(artist1.getRecords().contains(record2));

		record1.removeFromContributors(artist1);
		reRead();
		assertEquals(2, record1.getContributors().size());
		assertEquals(0, artist1.getRecords().size());
		assertFalse(record1.getContributors().contains(artist1));
		assertTrue(record1.getContributors().contains(artist2));
		assertTrue(record1.getContributors().contains(artist3));
		assertFalse(artist1.getRecords().contains(record1));
		assertTrue(artist2.getRecords().contains(record1));
		assertTrue(artist3.getRecords().contains(record1));

		record1.removeFromContributors(artist2);
		record1.removeFromContributors(artist3);
		reRead();
		assertEquals(0, record1.getContributors().size());
		assertEquals(0, artist2.getRecords().size());
		assertEquals(0, artist3.getRecords().size());
	}

}
