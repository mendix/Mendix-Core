package org.mod4j.runtime.queries;

import static org.junit.Assert.assertEquals;

import org.hibernate.criterion.MatchMode;
import org.junit.Test;

public class SearchParametersTest {

	@Test
	public void testToString() {

		SearchParameters sp = new SearchParameters();
		assertEquals(
				"org.mod4j.runtime.queries.SearchParameters[firstResult=null, maxResults=null, sortProperty=null, ascending=null, matchMode=ANYWHERE, ignoreCase=null]",
				sp.toString());

		sp.setAscending(true);
		sp.setFirstResult(10);
		sp.setMaxResults(20);
		sp.setIgnoreCase(false);
		sp.setMatchMode(MatchMode.EXACT);
		sp.setSortProperty("mySort");

		assertEquals(
				"org.mod4j.runtime.queries.SearchParameters[firstResult=10, maxResults=20, sortProperty=mySort, ascending=true, matchMode=EXACT, ignoreCase=false]",
				sp.toString());

	}

}
