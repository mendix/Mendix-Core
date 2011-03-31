package org.company.recordshop.service;

import static org.junit.Assert.assertTrue;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.transaction.jta.JtaTransactionManager;

/**
 * Test that the hierarchical Spring Application Context can be succesfully
 * initialised.
 * 
 * @author Eric Jan Malotaux
 */
public class SpringContextLoaderTest {

	@Before
	public final void setUp() throws Exception {
		SimpleNamingContextBuilder jndi = SimpleNamingContextBuilder
				.emptyActivatedContextBuilder();
		DataSource ds = new DriverManagerDataSource();
		jndi.bind("java:comp/env/jdbc/RecordShopDS", ds);

		JtaTransactionManager jtam = new JtaTransactionManager();
		jtam.setUserTransaction(EasyMock.createMock(UserTransaction.class));
		jndi.bind(JtaTransactionManager.DEFAULT_USER_TRANSACTION_NAME, jtam
				.getUserTransaction());
	}

	@Test
	public final void testContextLoader() {
		BeanFactoryLocator locator = MyBeanFactoryLocator
				.getInstance("classpath*:/org/company/recordshop/*/beanRefContext.xml");
		BeanFactoryReference reference = locator
				.useBeanFactory("org.company.recordshop.service.Context");
		CustomerServiceModelLocalService service = (CustomerServiceModelLocalService) reference
				.getFactory().getBean("customerServiceModelService");
	}

	@Test
	public void testNothing() {
		assertTrue(true);
	}

	class MyBeanFactoryLocator extends ContextSingletonBeanFactoryLocator {
		protected MyBeanFactoryLocator(String resourceLocation) {
			super(resourceLocation);
		}
	}
}
