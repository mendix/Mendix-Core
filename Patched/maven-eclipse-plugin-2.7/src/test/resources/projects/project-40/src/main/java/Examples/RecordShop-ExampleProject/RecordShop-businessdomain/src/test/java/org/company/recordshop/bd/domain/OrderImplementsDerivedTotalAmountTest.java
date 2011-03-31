package org.company.recordshop.bd.domain;

import static org.junit.Assert.*;

import org.company.recordshop.bd.domain.Order;
import org.company.recordshop.bd.domain.OrderLine;
import org.junit.Test;

public class OrderImplementsDerivedTotalAmountTest {

    @Test
    public void testGetTotalAmount() {
        
        OrderLine orderline1 = new OrderLine(1, "Orderline 1");
        OrderLine orderline2 = new OrderLine(2, "Orderline 2");
        OrderLine orderline3 = new OrderLine(3, "Orderline 3");
        OrderLine orderline4 = new OrderLine(4, "Orderline 4");
        OrderLine orderline5 = new OrderLine(5, "Orderline 5");
        
        Product pr01 = new Product( "pr01", 100.00F, true);
        Product pr02 = new Product( "pr02", 200.00F, true);
        Product pr03 = new Product( "pr03", 300.00F, true);
        Product pr04 = new Product( "pr04", 400.00F, true);
        Product pr05 = new Product( "pr05", 500.00F, true);
        
        orderline1.setProduct(pr01);
        orderline2.setProduct(pr02);
        orderline3.setProduct(pr03);
        orderline4.setProduct(pr04);
        orderline5.setProduct(pr05);
       
        Order order = new Order("1");
        order.addToOrderLines(orderline1);
        order.addToOrderLines(orderline2);
        order.addToOrderLines(orderline3);
        order.addToOrderLines(orderline4);
        order.addToOrderLines(orderline5);
        assertTrue("Order totalAmount should be equal to 1500.0", order.getTotalAmount() == 1500.0F);
        
    }
}
