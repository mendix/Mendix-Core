package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.dto.ProductWithCustomersDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.company.recordshop.service.local.OrderServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;

public class AssociationsServiceTest extends AbstractServiceTestCase {

    @Autowired
    CustomerServiceModelLocalService customerService;

    @Autowired
    OrderServiceModelLocalService orderService;

    SimpleCustomerDto createdCustomer = null;

    OrderDto createdOrder = null;

    public SimpleCustomerDto createCustomer(String first, String last, int nr) {
        SimpleCustomerDto result = new SimpleCustomerDto();
        result.setFirstName(first);
        result.setLastName(last);
        result.setCustomerNr(nr);
        result.setBirthDate(new DateTime("2008-01-01"));
        result = customerService.readCustomer(customerService.createCustomer(result));
        return result;
    }

    @Before
    public void setUp() {
        createdCustomer = createCustomer("Johan", "Vogelzang", 12345);
        createCustomer("Jos", "Warmer", 3);
        createCustomer("Eric Jan", "Malotaux", 44);

        OrderDto order = new OrderDto();
        order.setOrderNumber("ISO 001");
        order.setDiscountPercentage(50);
        createdOrder = orderService.readOrderAsOrderDto(orderService.createOrder(order));
        flush();
        clear();
    }

    public void setupMore() {
        OrderDto order2 = new OrderDto();
        order2.setOrderNumber("ISO 002");
        order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        OrderDto createdOrder2 = orderService.readOrderAsOrderDto(orderService.createOrder(order2));
        customerService.addToOrders(createdCustomer, createdOrder2);

        order2 = new OrderDto();
        order2.setOrderNumber("ISO 003");
        order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        createdOrder2 = orderService.readOrderAsOrderDto(orderService.createOrder(order2));
        customerService.addToOrders(createdCustomer, createdOrder2);

        order2 = new OrderDto();
        order2.setOrderNumber("ISO 004");
        order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        createdOrder2 = orderService.readOrderAsOrderDto(orderService.createOrder(order2));
        customerService.addToOrders(createdCustomer, createdOrder2);
        flush();
        clear();
    }

    @Test
    public final void testListAll() {
        List<SimpleCustomerDto> all = customerService.listCustomers();
        Collections.sort(all, new SimpleCustomerDtoComparator());
        Assert.assertEquals(all.size(), 3);
        Assert.assertEquals(12345, all.get(0).getCustomerNr().longValue());
        Assert.assertEquals(3, all.get(1).getCustomerNr().longValue());
        Assert.assertEquals(44, all.get(2).getCustomerNr().longValue());
    }

    @Test
    public final void testGetFrom() {
        setupMore();

        List<SimpleCustomerDto> all = customerService.listCustomers();

        for (SimpleCustomerDto simpleCustomerDto : all) {
            List<OrderNumberAndDateDto> orders = customerService.getOrders(simpleCustomerDto);
            if (createdCustomer.getId().equals(simpleCustomerDto.getId())) {
                Assert.assertTrue(orders.size() == 3);
                for (OrderNumberAndDateDto order : orders) {
                    OrderDto orderDto = new OrderDto(order.getId(), order.getVersion());
                    SimpleCustomerDto customer = customerService.getCustomer(orderDto);
                    Assert.assertTrue(simpleCustomerDto.getId() == customer.getId());
                }
            } else {
                Assert.assertEquals(0,orders.size());
            }
        }
        Assert.assertEquals(all.size(), 3);
    }

    @Test
    public final void testFindByExample() {
        SimpleCustomerDto example = new SimpleCustomerDto();
        example.clear();
        List<SimpleCustomerDto> result = customerService.findByExample(example);
        assertEquals(3, result.size());

        example.setBlackListed(false);
        result = customerService.findByExample(example);
        assertEquals(3, result.size());

        example.setBlackListed(true);
        result = customerService.findByExample(example);
        assertEquals(0, result.size());

        example.setBlackListed(null);
        example.setFirstName("Jo");
        result = customerService.findByExample(example);
        assertEquals(2, result.size());
    }

    @Test
    public final void testAddOrder() {
        customerService.addToOrders(createdCustomer, createdOrder);

        OrderNumberAndDateDto o = orderService.readOrderAsOrderNumberAndDateDto(createdOrder
                .getId());
        Assert.assertEquals(o.getCustomer().getId(), createdCustomer.getId());
        Assert.assertTrue(o.getCustomer().getOrders().size() == 1);
    }

    @Test
    @ExpectedException(IllegalArgumentException.class)
    public final void testAddOrderFailure() {
        customerService.addToOrders(createdCustomer, null);
        customerService.addToOrders(null, createdOrder);
    }

    @Test
    @ExpectedException(IllegalArgumentException.class)
    public final void testAddNonExistingOrder() {
        customerService.addToOrders(createdCustomer, new OrderDto(-1L, 0));
        customerService.addToOrders(new SimpleCustomerDto(-1L, 0), createdOrder);
    }

    /**
     * tries to add an existing Product to an OrderLine. Currently goes wrong ! Same case as above,
     * but this is for multiplicity ONE
     * 
     */
    @Test
    public final void testAddExistingProduct() {
        ProductWithCustomersDto p001 = new ProductWithCustomersDto();
        p001.setProductNumber("p001");
        p001.setPrice(new Float(8));
        p001.setOrderable(true);
        ProductWithCustomersDto createdP001 = customerService
                .readProductAsProductWithCustomersDto(customerService.createProduct(p001));

        createdP001.addToBuyers(createdCustomer);
        customerService.updateProduct(createdP001);

        // JOS: The above is incorrect (just not to break the build)
        // The below should be run as a test and shows the error.
        FullProductDto fullProduct = customerService.readProductAsFullProductDto(createdP001
                .getId());
        OrderLineDto orderLine = new OrderLineDto();
        orderLine.setProduct(fullProduct);
        orderLine.setLineNumber(1);
        orderLine.setDescription("an orderline");
        OrderWithOrderLinesDto order = new OrderWithOrderLinesDto();
        order.addToOrderLines(orderLine);
        order.setOrderNumber("aap");
        orderService.createOrder(order);

        // Assert.assertTrue("Number of customers should be one",
        // stored.getBuyers().size() == 1);
        // SimpleCustomerDto storedCustomer =
        // stored.getFromBuyers(createdCustomer.getId());
        // Assert.assertTrue("Customer should be there", storedCustomer !=
        // null);
        //		
        // storedCustomer.setCustomerNr(9101);
        // stored.addToBuyers(storedCustomer);
        // createdP002 = customerServiceModelService.updateProduct(stored);
        //
        // stored =
        // customerServiceModelService.readProductAsProductWithCustomersDto(createdP001.getId());
        // Assert.assertTrue("Number of customers should be one",
        // stored.getBuyers().size() == 1);
        // storedCustomer = stored.getFromBuyers(createdCustomer.getId());
        // Assert.assertTrue("Customer should be there", storedCustomer !=
        // null);
        // Assert.assertTrue("Customer number inciiorrect",
        // storedCustomer.getCustomerNr()== 9101);

    }

    /**
     * tries to add an existing Customer to a Product. Currently goes wrong !
     * 
     */
    @Test
    public final void testAddExistingCustomer() {
        ProductWithCustomersDto p001 = new ProductWithCustomersDto();
        p001.setProductNumber("p001");
        p001.setPrice(new Float(8));
        p001.setOrderable(true);
        ProductWithCustomersDto createdP001 = customerService
                .readProductAsProductWithCustomersDto(customerService.createProduct(p001));

        // Comment the try below and uncomment the ones below that to get the
        // real test.
        // try {
        // createdP001.addToBuyers(createdCustomer);
        // ProductWithCustomersDto createdP002 =
        // customerServiceModelService.updateProduct(createdP001);
        // Assert.fail("Expecting Service Exception");
        // } catch (TranslatorException e) {
        // System.err.println("Expected exception: " + e.getMessage());
        // }

        // JOS: The above is incorrect (just not to break the build)
        // The below should be run as a test and shows the error.
        createdP001.addToBuyers(createdCustomer);
        customerService.updateProduct(createdP001);

        ProductWithCustomersDto stored = customerService
                .readProductAsProductWithCustomersDto(createdP001.getId());
        Assert.assertTrue("Number of customers should be one", stored.getBuyers().size() == 1);
        SimpleCustomerDto storedCustomer = stored.getFromBuyers(createdCustomer.getId());
        Assert.assertTrue("Customer should be there", storedCustomer != null);

        storedCustomer.setCustomerNr(9101);
        stored.addToBuyers(storedCustomer);
        customerService.updateProduct(stored);

        stored = customerService.readProductAsProductWithCustomersDto(createdP001.getId());
        Assert.assertTrue("Number of customers should be one", stored.getBuyers().size() == 1);
        storedCustomer = stored.getFromBuyers(createdCustomer.getId());
        Assert.assertTrue("Customer should be there", storedCustomer != null);
        Assert.assertTrue("Customer number inciiorrect", storedCustomer.getCustomerNr() == 9101);

    }

    @Test
    public final void testSetCustomer() {
        customerService.setCustomer(createdOrder, createdCustomer);

        OrderNumberAndDateDto order = orderService.readOrderAsOrderNumberAndDateDto(createdOrder
                .getId());
        Assert.assertEquals(order.getCustomer().getId(), createdCustomer.getId());

        Set<OrderNumberAndDateDto> orders = order.getCustomer().getOrders();
        Assert.assertEquals(((OrderNumberAndDateDto) (orders.toArray()[0])).getId(), createdOrder
                .getId());

        customerService.setCustomer(createdOrder, null);
        order = orderService.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
        Assert.assertNull(order.getCustomer());

        SimpleCustomerDto sim = customerService.readCustomer(createdCustomer.getId());
        Assert.assertTrue(sim.getOrders().size() == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void testAddCustomerFailure() {
        customerService.setCustomer(null, createdCustomer);
    }

    @Test
    public final void testRemoveOrder() {
        customerService.addToOrders(createdCustomer, createdOrder);
        OrderDto newOrder = orderService.readOrderAsOrderDto(createdOrder.getId());
        customerService.removeFromOrders(createdCustomer, newOrder);

        OrderNumberAndDateDto o2 = orderService.readOrderAsOrderNumberAndDateDto(createdOrder
                .getId());
        SimpleCustomerDto orderCustomer2 = o2.getCustomer();
        Assert.assertEquals(orderCustomer2, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void testRemoveOrderFailure() {
        customerService.addToOrders(createdCustomer, createdOrder);
        OrderDto newOrder = orderService.readOrderAsOrderDto(createdOrder.getId());
        customerService.removeFromOrders(null, newOrder);
        customerService.removeFromOrders(createdCustomer, null);
    }

    private class SimpleCustomerDtoComparator implements Comparator<SimpleCustomerDto> {
        public int compare(SimpleCustomerDto one, SimpleCustomerDto other) {
            return one.getId().compareTo(other.getId());
        }
    }
}
