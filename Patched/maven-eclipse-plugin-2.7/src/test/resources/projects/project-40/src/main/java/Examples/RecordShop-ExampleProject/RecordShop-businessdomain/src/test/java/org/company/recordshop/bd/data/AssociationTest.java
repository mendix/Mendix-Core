package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.company.recordshop.bd.data.ArtistDao;
import org.company.recordshop.bd.data.CustomerDao;
import org.company.recordshop.bd.data.OrderDao;
import org.company.recordshop.bd.data.OrderLineDao;
import org.company.recordshop.bd.data.ProductDao;
import org.company.recordshop.bd.data.RecordDao;
import org.company.recordshop.bd.domain.Artist;
import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.OrderLine;
import org.company.recordshop.bd.domain.Product;
import org.company.recordshop.bd.domain.Record;
import org.company.recordshop.bd.domain.RecordTypeEnum;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jos Warmer
 * @author Eric Jan Malotaux
 */
public class AssociationTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderLineDao orderLineDao;

    @Autowired
    private RecordDao recordDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ArtistDao artistDao;

    private List<Customer> allCustomers = new ArrayList<Customer>();

    private List<Order> allOrders = new ArrayList<Order>();

    private List<OrderLine> allOrderLines = new ArrayList<OrderLine>();

    private List<Record> allRecords = new ArrayList<Record>();

    private List<Product> allProducts = new ArrayList<Product>();

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	protected Customer createCustomer(String firstname, String lastName, int custNr) {
        Customer result = new Customer(firstname, lastName, date(), custNr);
        allCustomers.add(result);
        customerDao.add(result);
        return result;
    }

    protected Order createOrder(String orderId, int discount) {
        Order result = new Order(orderId);
        result.setDiscountPercentage(discount);
        allOrders.add(result);
        orderDao.add(result);
        return result;
    }

    protected OrderLine createOrderLine(int i, String desc, Float ff) {
        OrderLine result = new OrderLine(i, desc);
        allOrderLines.add(result);
        orderLineDao.add(result);
        return result;
    }

    protected Record createRecord(int i, String asin, Float ff) {
        Record result = new Record(asin, ff, RecordTypeEnum.BLUERAY);
        allRecords.add(result);
        recordDao.add(result);
        return result;
    }

    protected Product createProduct(String prodNr, float price) {
        Product result = new Product(prodNr, price, false);
        allProducts.add(result);
        productDao.add(result);
        return result;
    }

    Customer c01, c02, c03, c04;

    Order oder01, order02, order03, o04, o05;

    OrderLine line01, line02, line03, line04, line05, line06;

    Record record01, record02, record03, record04, record05, record06, r07;

    Product pr01, pr02, pr03, pr04, pr05, pr06;

    Artist a01, a02, a03, a04;

    @Before
    public void createInstances() {
        c01 = createCustomer("Jos", "Warmer", 1);
        c02 = createCustomer("Piet", "Parel", 2);
        c03 = createCustomer("Joanna", "Krater", 3);
        c04 = createCustomer("Karen", "Grootjes", 4);

        oder01 = createOrder("order01", 1);
        order02 = createOrder("order02", 1);
        order03 = createOrder("order03", 1);
        o04 = createOrder("order04", 1);
        o05 = createOrder("order05", 1);

        c01.addToOrders(oder01);
        c01.addToOrders(order02);
        c01.addToOrders(order03);
        c02.addToOrders(o04);

        line01 = createOrderLine(1, "line01", 0F);
        line02 = createOrderLine(2, "line02", 0F);
        line03 = createOrderLine(3, "line03", 0F);
        line04 = createOrderLine(4, "line04", 0F);
        line05 = createOrderLine(5, "line05", 0F);
        line06 = createOrderLine(6, "line06", 0F);

        oder01.addToOrderLines(line01);
        oder01.addToOrderLines(line02);
        oder01.addToOrderLines(line03);
        order02.addToOrderLines(line04);
        order02.addToOrderLines(line05);
        order03.addToOrderLines(line06);

        record01 = createRecord(1, "rec 01", 2F);
        record02 = createRecord(1, "rec 02", 2F);
        record03 = createRecord(1, "rec 03", 2F);
        record04 = createRecord(1, "rec 04", 2F);
        record05 = createRecord(1, "rec 05", 2F);
        record06 = createRecord(1, "rec 06", 2F);

        pr01 = createProduct("product 01", 1);
        pr02 = createProduct("product 02", 2);
        pr03 = createProduct("product 03", 3);
        pr04 = createProduct("product 04", 4);
        pr05 = createProduct("product 05", 5);
        pr06 = createProduct("product 06", 6);

        line01.setProduct(pr01);
        line02.setProduct(pr02);
        line03.setProduct(pr03);
        line04.setProduct(pr04);
        line05.setProduct(pr05);
        line06.setProduct(pr06);
        
        record01.setProduct(pr01);
        record02.setProduct(pr01);
        record03.setProduct(pr01);
        record04.setProduct(pr04);

        a01 = createArtist("A", "Rtist 01", "Artist 01");
        a02 = createArtist("A", "Rtist 02", "Artist 02");
        a03 = createArtist("A", "Rtist 03", "Artist 03");
        a04 = createArtist("A", "Rtist 04", "Artist 04");

        record01.addToContributors(a01);
        record02.addToContributors(a02);
        record02.addToContributors(a03);
        record03.addToContributors(a04);

        flush();
    }

    private Artist createArtist(String firstName, String lastName, String artistName) {
        Artist artist = new Artist(firstName, lastName, date(), artistName);
        this.artistDao.add(artist);
        return artist;
    }

    public Customer lookupCustomer(Collection<Customer> coll, String name) {
        for (Customer customer : coll) {
            if (customer.getFirstName() != null) {
                if (customer.getFirstName().equals(name)) {
                    return customer;
                }
            } else {
                System.err.println("Customer  has null firstName");
            }
        }
        return null;
    }

    public Order lookupOrder(Collection<Order> coll, String name) {
        for (Order order : coll) {
            if (order.getOrderNumber() != null) {
                if (order.getOrderNumber().equals(name)) {
                    return order;
                }
            } else {
                System.err.println("Order number [" + order.getOrderNumber() + "] has null ordernumber");
            }
        }
        return null;
    }

    public Record lookupRecord(Collection<Record> coll, String name) {
        for (Record record : coll) {
            if (record.getAsin() != null) {
                if (record.getAsin().equals(name)) {
                    return record;
                }
            } else {
                System.err.println("Record asin has null asic");
            }
        }
        return null;
    }

    public Product lookupProduct(Collection<Product> coll, String name) {
        for (Product product : coll) {
            if (product.getProductNumber() != null) {
                if (product.getProductNumber().equals(name)) {
                    return product;
                }
            } else {
                System.err.println("product has null ProductNumnber");
            }
        }
        return null;
    }

    public OrderLine lookup(Collection<OrderLine> coll, int lineNr) {
        for (OrderLine line : coll) {
            if (line.getLineNumber() == lineNr) {
                return line;
            }
        }
        return null;
    }

    @Test
    public void testAssociationsJava() {
        customerAssociations(allCustomers);
        orderAssociations(allOrders);
        orderLineAssociations(allOrderLines);
        recordAssociations(allRecords);
        productAssociations(allProducts);
    }

    @Test
    public void testAssociationsHibernate() {
        clear();

        allCustomers = customerDao.listAll();
        assertEquals(4, allCustomers.size());
        c01 = lookupCustomer(allCustomers, "Jos");
        c02 = lookupCustomer(allCustomers, "Piet");
        c03 = lookupCustomer(allCustomers, "Joanna");
        c04 = lookupCustomer(allCustomers, "Karen");

        allOrders = orderDao.listAll();
        assertEquals(5, allOrders.size());
        oder01 = lookupOrder(allOrders, "order01");
        order02 = lookupOrder(allOrders, "order02");
        order03 = lookupOrder(allOrders, "order03");
        o04 = lookupOrder(allOrders, "order04");
        o05 = lookupOrder(allOrders, "order05");

        allOrderLines = orderLineDao.listAll();
        line01 = lookup(allOrderLines, 1);
        line02 = lookup(allOrderLines, 2);
        line03 = lookup(allOrderLines, 3);
        line04 = lookup(allOrderLines, 4);
        line05 = lookup(allOrderLines, 5);
        line06 = lookup(allOrderLines, 6);

        allRecords = recordDao.listAll();
        record01 = lookupRecord(allRecords, "rec 01");
        record02 = lookupRecord(allRecords, "rec 02");
        record03 = lookupRecord(allRecords, "rec 03");
        record04 = lookupRecord(allRecords, "rec 04");
        record05 = lookupRecord(allRecords, "rec 05");
        record06 = lookupRecord(allRecords, "rec 06");

        allProducts = productDao.listAll();
        pr01 = lookupProduct(allProducts, "product 01");
        pr02 = lookupProduct(allProducts, "product 02");
        pr03 = lookupProduct(allProducts, "product 03");
        pr04 = lookupProduct(allProducts, "product 04");

        instances();

        customerAssociations(allCustomers);
        orderAssociations(allOrders);
        orderLineAssociations(allOrderLines);
        recordAssociations(allRecords);
        productAssociations(allProducts);

    }

    public void customerAssociations(Collection<Customer> customers) {
        for (Customer c : customers) {
            for (Order o : c.getOrders()) {
                assertSame("t1", c, o.getCustomer());
            }
        }
    }

    public void orderAssociations(Collection<Order> orders) {
        for (Order o : orders) {
            if (o.getCustomer() != null) {
                assertTrue(o.getCustomer().getOrders().contains(o));
            }
        }
    }

    public void orderLineAssociations(Collection<OrderLine> orderLines) {
        for (OrderLine ol : orderLines) {
            Product pr = ol.getProduct();
            assertNotNull(pr);
            assertSame("t3", ol, pr.getOrderLine());
        }
    }

    public void recordAssociations(Collection<Record> records) {
        for (Record r : records) {
            if (r.getProduct() != null) {
                assertTrue(r.getProduct().getRecords().contains(r));
            }
            for (Artist artist : r.getContributors()) {
                assertTrue(artist.getRecords().contains(r));
            }
        }
    }

    public void productAssociations(Collection<Product> products) {
        for (Product p : products) {
            assertNotNull(p.getOrderLine());
            assertSame(p, p.getOrderLine().getProduct());
        	for (Record r : p.getRecords()) {
                assertSame("t4", p, r.getProduct());
            }
        }
    }

    @Test
    public void testInstances() {
        instances();
    }

    public void instances() {
        assertTrue(c01.getOrders().contains(oder01));
        assertTrue(c01.getOrders().contains(order02));
        assertTrue(c01.getOrders().contains(order03));
        assertEquals(3, c01.getOrders().size());

        assertTrue(c02.getOrders().contains(o04));
        assertEquals(1, c02.getOrders().size());

        assertNull(o05.getCustomer());

        assertTrue(oder01.getOrderLines().contains(line01));
        assertTrue(oder01.getOrderLines().contains(line02));
        assertTrue(oder01.getOrderLines().contains(line03));

        assertTrue(order02.getOrderLines().contains(line04));
        assertTrue(order02.getOrderLines().contains(line05));

        assertTrue(order03.getOrderLines().contains(line06));

        assertSame(pr01, record01.getProduct());
        assertSame(pr01, record02.getProduct());
        assertSame(pr01, record03.getProduct());
        assertSame(pr04, record04.getProduct());

        assertEquals(3, pr01.getRecords().size());
        assertEquals(0, pr02.getRecords().size());
        assertEquals(0, pr03.getRecords().size());
        assertEquals(1, pr04.getRecords().size());
    }

    @Test
    public void testDeleteAssociationsOne2Many() {

        // Remove an element from a one2many at source side
        c01.removeFromOrders(oder01);
        assertEquals(2, c01.getOrders().size());
        assertFalse(c01.getOrders().contains(oder01));
        assertNull(oder01.getCustomer());

        // Move an element from one one2many at source side to another one
        assertTrue(c02.getOrders().contains(o04));
        c01.addToOrders(o04);
        assertEquals(3, c01.getOrders().size());
        assertTrue(c01.getOrders().contains(o04));
        assertEquals(false, c02.getOrders().contains(o04));
        assertSame(c01, o04.getCustomer());

        // set from target side with existing source
        order02.setCustomer(null);
        assertNull(order02.getCustomer());
        assertFalse(c01.getOrders().contains(order02));

        // set from target side withour existing source
        o05.setCustomer(null);
        assertNull(o05.getCustomer());

        // set from target side withour existing source
        o05.setCustomer(c04);
        assertSame(c04, o05.getCustomer());
        assertTrue(c04.getOrders().contains(o05));

        // Move an element from one one2many at source side to another one
        line01.setProduct(null);
        assertNull(line01.getProduct());
        assertNull(pr01.getOrderLine());
    }

    public boolean existsOrderLineWithNumber(Set<OrderLine> orderlines, int num) {

        for (OrderLine o : orderlines) {
            if (o.getLineNumber() == num)
                return true;
        }
        return false;
    }
}
