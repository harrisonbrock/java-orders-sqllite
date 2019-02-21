package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Order;
import com.harrisonbrock.orders.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Order getOrderById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Order addOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public Order updateOrderById(Order order, long id) {
        return null;
    }
}
