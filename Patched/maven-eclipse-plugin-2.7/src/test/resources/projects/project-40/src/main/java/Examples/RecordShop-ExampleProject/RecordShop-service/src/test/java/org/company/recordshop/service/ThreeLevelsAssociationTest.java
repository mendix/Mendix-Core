package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 * 
 */
public class ThreeLevelsAssociationTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    CustomerWithOrdersAndOrderLines customerDto;

    /**
     * Create a customer dto with orders and orderlines to be translated to a DO.
     */
    @Before
    public void setUp() {

        customerDto = new CustomerWithOrdersAndOrderLines();
        customerDto.setCustomerNr(1234);
        customerDto.setFirstName("Buyer");
        customerDto.setLastName("TheCustomer");
        customerDto.setBirthDate(new DateTime("1970-01-01"));

        FullProductDto productDto1 = new FullProductDto();
        productDto1.setProductNumber("PRODNR-1");
        productDto1.setPrice(99.99f);
        productDto1.setOrderable(true);
        FullProductDto productDto2 = new FullProductDto();
        productDto2.setProductNumber("PRODNR-2");
        productDto2.setPrice(99.99f);
        productDto2.setOrderable(true);
        FullProductDto productDto3 = new FullProductDto();
        productDto3.setProductNumber("PRODNR-3");
        productDto3.setPrice(99.99f);
        productDto3.setOrderable(true);
        FullProductDto productDto4 = new FullProductDto();
        productDto4.setProductNumber("PRODNR-4");
        productDto4.setPrice(99.99f);
        productDto4.setOrderable(true);

        OrderWithOrderLinesDto order1 = new OrderWithOrderLinesDto();
        order1.setOrderNumber("ORDER-1");
        OrderLineDto orderLineDto1 = new OrderLineDto();
        orderLineDto1.setLineNumber(1);
        orderLineDto1.setDescription("ORDER-1-ORDERLINE-1");
        orderLineDto1.setProduct(productDto1);
        OrderLineDto orderLineDto2 = new OrderLineDto();
        orderLineDto2.setLineNumber(2);
        orderLineDto2.setDescription("ORDER-1-ORDERLINE-2");
        orderLineDto2.setProduct(productDto2);
        order1.addToOrderLines(orderLineDto1);
        order1.addToOrderLines(orderLineDto2);

        OrderWithOrderLinesDto order2 = new OrderWithOrderLinesDto();
        order2.setOrderNumber("ORDER-2");
        OrderLineDto orderLineDto3 = new OrderLineDto();
        orderLineDto3.setLineNumber(1);
        orderLineDto3.setDescription("ORDER-2-ORDERLINE-1");
        orderLineDto3.setProduct(productDto3);
        OrderLineDto orderLineDto4 = new OrderLineDto();
        orderLineDto4.setLineNumber(2);
        orderLineDto4.setDescription("ORDER-2-ORDERLINE-2");
        orderLineDto4.setProduct(productDto4);
        order2.addToOrderLines(orderLineDto3);
        order2.addToOrderLines(orderLineDto4);

        customerDto.addToOrders(order1);
        customerDto.addToOrders(order2);
    }

    @Test
    public void testCreateCustomerWithOrdersAndOrderLinesAndProducts() throws Exception {

        /**
         * Save, flush and check.
         */

        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerServiceModelService
                        .createCustomer(customerDto));
        flush();

        assertEquals(2, createdCustomer.getOrders().size());
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            assertTrue(orderDto.getId() > 0);
            assertEquals(2, orderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : orderDto.getOrderLines()) {
                assertTrue(orderLineDto.getId() > 0);
                assertTrue(orderLineDto.getProduct().getId() > 0);
                assertTrue(orderLineDto.getDescription().contains(
                        "-ORDERLINE-" + orderLineDto.getLineNumber()));
                assertTrue(orderLineDto.getProduct().getProductNumber().startsWith("PRODNR-"));
            }
        }
    }

    /**
     * Delete one orderline from each order, Update and check.
     */
    @Test
    public void testUpdateRemovedOrderLines() {

        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerServiceModelService
                        .createCustomer(customerDto));
        flush();

        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            OrderLineDto toBeRemoved = null;
            for (OrderLineDto orderLineDto : orderDto.getOrderLines()) {
                if (orderLineDto.getLineNumber() == 1) {
                    toBeRemoved = orderLineDto;
                }
            }
            orderDto.removeFromOrderLines(toBeRemoved);
        }

        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            assertEquals(1, orderDto.getOrderLines().size());
        }

        // Update the complete customer structure in one service call.
        customerServiceModelService.updateCustomer(createdCustomer);
        flush();
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(createdCustomer.getId());

        assertEquals(2, updatedCustomer.getOrders().size());
        for (OrderWithOrderLinesDto updatedOrderDto : updatedCustomer.getOrders()) {
            assertEquals(1, updatedOrderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : updatedOrderDto.getOrderLines()) {
                assertTrue(2 == orderLineDto.getLineNumber());
            }
        }
    }

    /**
     * Add a new orderline to each order and check.
     */
    @Test
    public void testUpdateOrdersWithNewOrderLine() throws Exception {

        Long customerId = customerServiceModelService.createCustomer(customerDto);
        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        flush();
        // createdCustomer =
        // customerServiceModelService.readCustomerAsCustomerWithOrdersAndOrderLines(createdCustomer.getId());

        OrderLineDto orderLineDtoNew = new OrderLineDto();
        orderLineDtoNew.setLineNumber(3);
        orderLineDtoNew.setDescription("ORDER-NEW-ORDERLINE-3");

        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            orderDto.addToOrderLines(orderLineDtoNew);
        }

        // Update the complete customer structure in one service call.
        customerServiceModelService.updateCustomer(createdCustomer);
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        flush();
        // JOS: Added to make the test succeed, but it should not be needed.
        updatedCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(updatedCustomer.getId());

        assertEquals(2, updatedCustomer.getOrders().size());
        for (OrderWithOrderLinesDto updatedOrderDto : updatedCustomer.getOrders()) {
            assertEquals(3, updatedOrderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : updatedOrderDto.getOrderLines()) {
                if (orderLineDto.getLineNumber() == 3) {
                    assertTrue(orderLineDto.getId() > 0);
                    assertTrue("ORDER-NEW-ORDERLINE-3".equals(orderLineDto.getDescription()));
                }
            }
        }
    }

    /**
     * Update the several attribute values through the hierarchy.
     */
    @Test
    public void testChangeValueInOrderLine() throws Exception {

        Long customerId = customerServiceModelService.createCustomer(customerDto);
        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        flush();

        createdCustomer.setLastName("-CHICKEN-IN-");
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            for (OrderLineDto orderLine : orderDto.getOrderLines()) {
                orderLine.setDescription("-THE-BASKET-");
                orderLine.getProduct().setPrice(10f);
            }
        }

        // Update the complete customer structure in one service call.
        customerServiceModelService.updateCustomer(createdCustomer);
        flush();
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);

        assertTrue(updatedCustomer.getLastName().equals("-CHICKEN-IN-"));
        for (OrderWithOrderLinesDto orderDto : updatedCustomer.getOrders()) {
            for (OrderLineDto orderLine : orderDto.getOrderLines()) {
                assertTrue(orderLine.getDescription().equals("-THE-BASKET-"));
                assertTrue(orderLine.getProduct().getPrice() == 10f);
            }
        }

    }
}