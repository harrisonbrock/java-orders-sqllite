package com.harrisonbrock.orders.controller;

import com.harrisonbrock.orders.model.Order;
import com.harrisonbrock.orders.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable long id) {
        return service.getOrderById(id);
    }
}
