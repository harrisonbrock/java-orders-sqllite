package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Customer;
import com.harrisonbrock.orders.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Customer updateCustomer(Customer customer, long id) {

        Optional<Customer> updateCustomer = repository.findById(id);

        if (updateCustomer.isPresent()) {
            customer.setId(id);
            repository.save(customer);
            return customer;
        }
        return null;
    }
}
