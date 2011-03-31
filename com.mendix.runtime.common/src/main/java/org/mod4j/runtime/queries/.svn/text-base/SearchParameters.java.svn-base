/**
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.mod4j.runtime.queries;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;

/**
 * Container object for common search parameters.
 * 
 */
@SuppressWarnings("serial")
public class SearchParameters implements Serializable {

	/**
	 * The index of the first result object to be retrieved (numbered from 0).
	 */
	private Integer firstResult;

	/**
	 * The maximum number of result objects to retrieve (or <=0 for no limit).
	 */
	private Integer maxResults;

	/**
	 * The property of the object to sort on (or <code>null</code> for no
	 * sorting).
	 */
	private String sortProperty;

	/**
	 * Should the returned list be sorted ascending or descending?
	 */
	private Boolean ascending;

	/**
	 * Defaults to MatchMode.ANYWHERE
	 * 
	 * @see org.hibernate.criterion.MatchMode 
	 */
	private MatchMode matchMode = MatchMode.ANYWHERE;

	/**
	 * Should the search ignore case for all string-valued properties?
	 */
	private Boolean ignoreCase;

	/**
	 * @return ignoreCase (Boolean) Should the search ignore case for all
	 *         string-valued properties?
	 */
	public Boolean isIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * @param ignoreCase
	 *            (Boolean) should the search ignore case for all string-valued
	 *            properties?
	 */
	public void setIgnoreCase(Boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}

	/**
	 * 
	 * @return firstResult (Integer) the index of the first result object to be
	 *         retrieved (numbered from 0).
	 */
	public Integer getFirstResult() {
		return this.firstResult;
	}

	/**
	 * @param firstResult
	 *            (Integer) the index of the first result object to be retrieved
	 *            (numbered from 0).
	 */
	public void setFirstResult(final Integer firstResult) {
		this.firstResult = firstResult;
	}

	/**
	 * 
	 * @return maxResults (Integer) the maximum number of result objects to
	 *         retrieve (or <=0 for no limit).
	 */
	public Integer getMaxResults() {
		return this.maxResults;
	}

	/**
	 * @param maxResults
	 *            (Integer) the maximum number of result objects to retrieve (or
	 *            <=0 for no limit).
	 */
	public void setMaxResults(final Integer maxResults) {
		this.maxResults = maxResults;
	}

	/**
	 * 
	 * @return sortProperty (String) the property of the object to sort on (or
	 *         <code>null</code> for no sorting).
	 */
	public String getSortProperty() {
		return this.sortProperty;
	}

	/**
	 * @param sortProperty
	 *            (String) the property of the object to sort on (or
	 *            <code>null</code> for no sorting).
	 */
	public void setSortProperty(final String sortProperty) {
		this.sortProperty = sortProperty;
	}

	/**
	 * 
	 * @return ascending (Boolean) should the returned list be sorted ascending
	 *         or descending?
	 */
	public Boolean isAscending() {
		return this.ascending;
	}

	/**
	 * @param ascending
	 *            (Boolean) should the returned list be sorted ascending or
	 *            descending?
	 */
	public void setAscending(final Boolean ascending) {
		this.ascending = ascending;
	}

	/**
	 * 
	 * @return matchMode
	 *            the match mode that will be applied in the search.
	 */
	public MatchMode getMatchMode() {
		return this.matchMode;
	}

	/**
	 * @param matchMode
	 *            the match mode to be used in the search.
	 */
	public void setMatchMode(final MatchMode matchMode) {
		this.matchMode = matchMode;
	}

	/**
	 * Creates an Example object based on the given <code>domainExample</code>.
	 * If set, also this SearchParameters matchMode and ignoreCase will be
	 * applied to the returned Example.
	 * 
	 * @param domainExample
	 * @return Example
	 */
	public Example createExample(final Object domainExample) {

		Example example = Example.create(domainExample);
		if (this.matchMode != null) {
			example.enableLike(this.matchMode);
		}
		if (this.ignoreCase != null && this.ignoreCase) {
			example.ignoreCase();
		}
		return example;
	}

	/**
	 * Constrains the given <code>criteria</code> object by applying the
	 * pagination and sorting attributes (firstResult, maxResults, sortProperty
	 * and ascending) to it.
	 * 
	 * @param criteria
	 * @return The constrained <code>criteria</code> object.
	 */
	public Criteria constrainCriteria(final Criteria criteria) {
		
		if (this.firstResult != null) {
			criteria.setFirstResult(this.firstResult);
		}
		if (this.maxResults != null) {
			criteria.setMaxResults(this.maxResults);
		}
		if (this.sortProperty != null) {
			if (this.ascending != null && this.ascending) {
				criteria.addOrder(Order.asc(this.sortProperty));
			} else {
				criteria.addOrder(Order.desc(this.sortProperty));
			}
		}
		return criteria;
	}

	/**
	 * Returns a String representation of the internal state of this object.
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("org.mod4j.runtime.queries.SearchParameters[");
		result.append("firstResult=");
		result.append(firstResult);
		result.append(", ");
		result.append("maxResults=");
		result.append(maxResults);
		result.append(", ");
		result.append("sortProperty=");
		result.append(sortProperty);
		result.append(", ");
		result.append("ascending=");
		result.append(ascending);
		result.append(", ");
		result.append("matchMode=");
		result.append(matchMode.toString());
		result.append(", ");
		result.append("ignoreCase=");
		result.append(ignoreCase);
		result.append("]");
		return result.toString();
	}
}