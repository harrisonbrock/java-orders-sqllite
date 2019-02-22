package com.harrisonbrock.orders.repositories;

import com.harrisonbrock.orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
//    List<Order> findById(long id);
}
