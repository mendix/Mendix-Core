package org.company.recordshop.bd.data;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Common abstract superclass for Dao integration tests.
 * 
 * @author Eric Jan Malotaux
 */
@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
		"/org/company/recordshop/bd/applicationContext.xml",
		"/org/company/recordshop/bd/data/sessionFactoryContext.xml",
		"/org/company/recordshop/bd/data/testDataSourceContext.xml" })
public abstract class AbstractDaoTestCase extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	protected SessionFactory sessionFactory;

	protected void flush() {
		sessionFactory.getCurrentSession().flush();
	}

	protected void clear() {
		sessionFactory.getCurrentSession().clear();
	}
}
