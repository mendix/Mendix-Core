package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.company.recordshop.bd.domain.Customer;
import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.OrderLine;
import org.company.recordshop.service.AbstractServiceTestCase;
import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerWithOrdersAndOrderLinesTranslatorTest extends AbstractServiceTestCase {

    public class OrderDtoComparator implements Comparator<OrderWithOrderLinesDto> {

        public int compare(OrderWithOrderLinesDto o1, OrderWithOrderLinesDto o2) {
            return o1.getOrderNumber().compareTo(o2.getOrderNumber());
        }

    }

    public class OrderLineComparator implements Comparator<OrderLine> {

        public int compare(OrderLine o1, OrderLine o2) {
            return o1.getLineNumber() - o2.getLineNumber();
        }
    }

    @Autowired
    CustomerWithOrdersAndOrderLinesTranslator customerWithOrdersAndOrderLinesTranslator; // = new
                                                                                         // CustomerWithOrdersAndOrderLinesTranslator();

    public void setCustomerWithOrdersAndOrderLinesTranslator(
            CustomerWithOrdersAndOrderLinesTranslator customerWithOrdersAndOrderLinesTranslator) {
        this.customerWithOrdersAndOrderLinesTranslator = customerWithOrdersAndOrderLinesTranslator;
    }

    @Test
    public void testFromDtoWithTwoLevelsOfReferences() throws Exception {
        CustomerRepository repository = new CustomerRepository();
        /**
         * Create a customer dto with orders and orderlines to be translated to a DO.
         */
        CustomerWithOrdersAndOrderLines dto = createCustomerDto(new String[] { "1", "2" }, new String[] { "3", "4" });
        /**
         * Translate it to a DO and check.
         */
        Customer created = customerWithOrdersAndOrderLinesTranslator.fromDto(dto);
        checkCustomer(created, new String[] { "1", "2" }, new String[] { "3", "4" });
        /**
         * "Save" the customer and retrieve. Id's will be added to all domain objects. Then transform to a DTO again.
         */
        Customer saved = repository.get(repository.save(created));
        dto = customerWithOrdersAndOrderLinesTranslator.toDto(saved);
        customerWithOrdersAndOrderLinesTranslator.fromDto(dto, saved);
        checkCustomer(saved, new String[] { "1", "2" }, new String[] { "3", "4" });

        /**
         * Delete one orderline from each order and check.
         */
        List<OrderWithOrderLinesDto> orderList = new ArrayList<OrderWithOrderLinesDto>(dto.getOrders());
        Collections.sort(orderList, new OrderDtoComparator());
        orderList.get(0).removeFromOrderLines(0);
        orderList.get(1).removeFromOrderLines(0);
        customerWithOrdersAndOrderLinesTranslator.fromDto(dto, saved);
        checkCustomer(saved, new String[] { "1", "2" }, new String[] { "4" });
        /**
         * Add a new orderline to each order and check.
         */
        orderList.get(0).addToOrderLines(createOrderLine(5, "5"));
        orderList.get(1).addToOrderLines(createOrderLine(5, "5"));
        customerWithOrdersAndOrderLinesTranslator.fromDto(dto, saved);
        checkCustomer(saved, new String[] { "1", "2" }, new String[] { "4", "5" });
    }

    private void checkCustomer(Customer customer, String[] orderNumbers, String[] products) {
        List<Order> orders = new ArrayList<Order>(customer.getOrders());
        Collections.sort(orders, new OrderComparator());
        assertEquals(orderNumbers.length, orders.size());
        for (int i = 0; i < orderNumbers.length; i++) {
            assertEquals(orderNumbers[i], orders.get(i).getOrderNumber());
            assertEquals(customer, orders.get(i).getCustomer());

            List<OrderLine> lines = new ArrayList<OrderLine>(orders.get(i).getOrderLines());
            Collections.sort(lines, new OrderLineComparator());
            assertEquals(products.length, lines.size());
            for (int j = 0; j < products.length; j++) {
                assertEquals(products[j], lines.get(j).getProduct().getProductNumber());
            }
        }
    }

    private CustomerWithOrdersAndOrderLines createCustomerDto(String[] orderNumbers, String[] productNumbers) {
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

    private class OrderComparator implements Comparator<Order> {
        public int compare(Order o1, Order o2) {
            return o1.getOrderNumber().compareTo(o2.getOrderNumber());
        }
    }

    private class CustomerRepository {
        private Map<Long, Customer> customers = new HashMap<Long, Customer>();

        Long customerId = 0L;

        Long orderId = 0L;

        public Long save(Customer customer) throws Exception {
            setId(customer, ++customerId);
            customers.put(customerId, customer);
            List<Order> orders = new ArrayList<Order>(customer.getOrders());
            Collections.sort(orders, new OrderComparator());
            for (Order order : orders) {
                setId(order, ++orderId);
            }
            return customerId;
        }

        public Customer get(Long id) throws Exception {
            Customer customer = customers.get(id);
            Customer result = new Customer(customer.getFirstName(), customer.getLastName(), customer.getBirthDate(),
                    customer.getCustomerNr());
            setId(result, customer.getId());
            for (Order order : customer.getOrders()) {
                Order newOrder = new Order(order.getOrderNumber());
                setId(newOrder, order.getId());
                result.addToOrders(newOrder);
                for (OrderLine line : order.getOrderLines()) {
                    OrderLine newLine = new OrderLine(line.getLineNumber(), line.getDescription());
                    newLine.setProduct(line.getProduct());
                    setId(newLine, line.getId());
                    newOrder.addToOrderLines(newLine);
                }
            }
            return result;
        }

        private void setId(Object object, Long id) throws Exception {
            Class<?> clazz = object.getClass();
            while (!clazz.getSuperclass().equals(Object.class)) {
                clazz = clazz.getSuperclass();
            }
            Field idField = clazz.getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(object, id);
        }
    }
}