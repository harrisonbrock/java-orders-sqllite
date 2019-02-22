package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(long id);
    Order addOrder(Order order);
    Order updateOrderById(Order order, long id);
}
