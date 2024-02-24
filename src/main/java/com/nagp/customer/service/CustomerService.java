package com.nagp.customer.service;

import com.nagp.customer.entity.Customer;
import com.nagp.customer.entity.request.CreateCustomerRequest;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer createCustomer(CreateCustomerRequest createCustomerRequest);
}
