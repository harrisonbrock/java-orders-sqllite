package com.harrisonbrock.orders.controller;

import com.harrisonbrock.orders.model.Customer;
import com.harrisonbrock.orders.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/custcode/{id}")
    public Customer getCustomerById(@PathVariable long id) {
        return service.getCustomerById(id);
    }

    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }
}
