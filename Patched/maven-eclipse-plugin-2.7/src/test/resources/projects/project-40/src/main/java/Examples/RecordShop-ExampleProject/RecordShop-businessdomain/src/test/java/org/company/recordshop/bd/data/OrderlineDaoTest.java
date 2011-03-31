package org.company.recordshop.bd.data;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.company.recordshop.bd.data.OrderLineDao;
import org.company.recordshop.bd.domain.OrderLine;
import org.company.recordshop.bd.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 */
public class OrderlineDaoTest extends AbstractDaoTestCase {

	@Autowired
	private OrderLineDao orderLineDao;

	@Test
	public void testAddAndRetrieve() {
       
	    Product product = new Product("PRODNR-1234", 99.99f, true);
        
        OrderLine orderLine = new OrderLine(1, "ORDERLINE-1");
        orderLine.setProduct(product);
        
        orderLineDao.add(orderLine);
        flush();
        clear();

        OrderLine saved = orderLineDao.retrieve(orderLine.getId());
        assertTrue(saved.getProduct().getId() > 0);
        assertEquals("PRODNR-1234", saved.getProduct().getProductNumber());
    }
}
