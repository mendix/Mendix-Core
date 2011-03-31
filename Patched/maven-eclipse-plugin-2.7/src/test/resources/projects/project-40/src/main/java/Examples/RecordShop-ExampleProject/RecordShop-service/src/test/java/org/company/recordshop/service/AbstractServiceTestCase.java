package org.company.recordshop.service;

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
        "/org/company/recordshop/bd/data/sessionFactoryContext.xml",
        "/org/company/recordshop/bd/applicationContext.xml",
        "/org/company/recordshop/service/dtoTranslatorsContext.xml",
        "/org/company/recordshop/service/applicationContext.xml",
        "/org/company/recordshop/service/testContext.xml" })
public abstract class AbstractServiceTestCase extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    protected SessionFactory sessionFactory;

    protected void flush() {
        sessionFactory.getCurrentSession().flush();
    }

    protected void clear() {
        sessionFactory.getCurrentSession().clear();
    }
}
