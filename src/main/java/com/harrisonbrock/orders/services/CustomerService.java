package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(long id);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer, long id);

}
