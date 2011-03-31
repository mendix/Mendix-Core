package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.bd.data.ProductDao;
import org.company.recordshop.bd.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 */
public class ProductDaoTest extends AbstractDaoTestCase {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testAddAndRetrieve() {

        Product product = new Product("PRODNR-1234", 99.99f, true);

        productDao.add(product);
        flush();
        clear();

        Product saved = productDao.retrieve(product.getId());
        assertEquals("PRODNR-1234", saved.getProductNumber());

    }
}
