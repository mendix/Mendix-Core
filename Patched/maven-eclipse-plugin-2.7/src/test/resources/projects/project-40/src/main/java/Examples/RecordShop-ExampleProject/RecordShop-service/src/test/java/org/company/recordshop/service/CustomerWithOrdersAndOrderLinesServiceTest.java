package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerWithOrdersAndOrderLinesServiceTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    public class OrderDtoComparator implements Comparator<OrderWithOrderLinesDto> {

        public int compare(OrderWithOrderLinesDto o1, OrderWithOrderLinesDto o2) {
            return o1.getOrderNumber().compareTo(o2.getOrderNumber());
        }

    }

    public class OrderLineComparator implements Comparator<OrderLineDto> {

        public int compare(OrderLineDto o1, OrderLineDto o2) {
            return o1.getLineNumber() - o2.getLineNumber();
        }
    }

    @Test
    public void testFromDtoWithTwoLevelsOfReferences() throws Exception {
        /**
         * Create a customer dto with orders and orderlines to be translated to a DO.
         */
        CustomerWithOrdersAndOrderLines dto = createCustomerDto(new String[] { "1", "2" },
                new String[] { "3", "4" });
        /**
         * Save it and check.
         */
        Long customerId = customerServiceModelService.createCustomer(dto);
        CustomerWithOrdersAndOrderLines created = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        checkCustomer(created, new String[] { "1", "2" }, new String[] { "3", "4" });

        /**
         * Delete one orderline from each order and check.
         */
        List<OrderWithOrderLinesDto> orderList = new ArrayList<OrderWithOrderLinesDto>(created
                .getOrders());
        Collections.sort(orderList, new OrderDtoComparator());
        orderList.get(0).removeFromOrderLines(0);
        orderList.get(1).removeFromOrderLines(0);
        customerServiceModelService.updateCustomer(created);
        CustomerWithOrdersAndOrderLines updated = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        checkCustomer(updated, new String[] { "1", "2" }, new String[] { "4" });
        /**
         * Add a new orderline to each order and check.
         */
        orderList = new ArrayList<OrderWithOrderLinesDto>(updated.getOrders());
        orderList.get(0).addToOrderLines(createOrderLine(5, "5"));
        orderList.get(1).addToOrderLines(createOrderLine(5, "5"));
        customerServiceModelService.updateCustomer(updated);
        updated = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        checkCustomer(updated, new String[] { "1", "2" }, new String[] { "4", "5" });

        /**
         * Update the productnumber in the orderlines of both orders from 4 to 6. So leave the one
         * with productnumber 5 alone.
         */
        orderList = new ArrayList<OrderWithOrderLinesDto>(updated.getOrders());
        assertEquals("4", orderList.get(0).getOrderLines().get(0).getProduct().getProductNumber());
        orderList.get(0).getOrderLines().get(0).getProduct().setProductNumber("6");
        assertEquals("4", orderList.get(1).getOrderLines().get(0).getProduct().getProductNumber());
        orderList.get(1).getOrderLines().get(0).getProduct().setProductNumber("6");
        customerServiceModelService.updateCustomer(updated);
        updated = customerServiceModelService
                .readCustomerAsCustomerWithOrdersAndOrderLines(customerId);
        checkCustomer(updated, new String[] { "1", "2" }, new String[] { "6", "5" });
    }

    private void checkCustomer(CustomerWithOrdersAndOrderLines customer, String[] orderNumbers,
            String[] products) {
        List<OrderWithOrderLinesDto> orders = new ArrayList<OrderWithOrderLinesDto>(customer
                .getOrders());
        Collections.sort(orders, new OrderComparator());
        assertEquals(orderNumbers.length, orders.size());
        for (int i = 0; i < orderNumbers.length; i++) {
            assertEquals(orderNumbers[i], orders.get(i).getOrderNumber());

            List<OrderLineDto> lines = new ArrayList<OrderLineDto>(orders.get(i).getOrderLines());
            Collections.sort(lines, new OrderLineComparator());
            assertEquals(products.length, lines.size());
            for (int j = 0; j < products.length; j++) {
                assertEquals(products[j], lines.get(j).getProduct().getProductNumber());
            }
        }
    }

    private CustomerWithOrdersAndOrderLines createCustomerDto(String[] orderNumbers,
            String[] productNumbers) {
        CustomerWithOrdersAndOrderLines result = new CustomerWithOrdersAndOrderLines();
        result.setBirthDate(new DateTime("1955-10-17"));
        result.setFirstName("Piet");
        result.setLastName("Heijn");
        result.setCustomerNr(1);

        for (String orderNumber : orderNumbers) {
            result.addToOrders(createOrder(orderNumber, productNumbers));
        }
        return result;
    }

    private OrderWithOrderLinesDto createOrder(String orderNumber, String[] productNumbers) {
        OrderWithOrderLinesDto order = new OrderWithOrderLinesDto();
        order.setOrderNumber(orderNumber);

        int i = 0;
        for (String productNumber : productNumbers) {
            order.addToOrderLines(createOrderLine(++i, productNumber));
        }
        return order;
    }

    private OrderLineDto createOrderLine(int i, String productNumber) {
        OrderLineDto line = new OrderLineDto();
        line.setDescription("empty");
        line.setLineNumber(i);
        FullProductDto product = new FullProductDto();
        product.setProductNumber(productNumber);
        product.setPrice(15.0F);
        product.setOrderable(true);
        line.setProduct(product);
        return line;
    }

    private class OrderComparator implements Comparator<OrderWithOrderLinesDto> {
        public int compare(OrderWithOrderLinesDto o1, OrderWithOrderLinesDto o2) {
            return o1.getOrderNumber().compareTo(o2.getOrderNumber());
        }
    }
}