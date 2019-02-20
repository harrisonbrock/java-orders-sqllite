package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Customer;
import com.harrisonbrock.orders.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        return repository.findById(id).orElse(new Customer());
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return repository.save(customer);
    }
}
