package com.harrisonbrock.orders.repositories;

import com.harrisonbrock.orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
