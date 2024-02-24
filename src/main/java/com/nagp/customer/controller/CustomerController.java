package com.nagp.customer.controller;

import com.nagp.customer.entity.Customer;
import com.nagp.customer.entity.request.CreateCustomerRequest;
import com.nagp.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return ResponseEntity.ok(allCustomers);
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return new ResponseEntity<Customer>(customerService.createCustomer(createCustomerRequest), HttpStatus.CREATED);
    }
}
