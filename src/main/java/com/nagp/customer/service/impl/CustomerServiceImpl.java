package com.nagp.customer.service.impl;

import com.nagp.customer.entity.Customer;
import com.nagp.customer.entity.request.CreateCustomerRequest;
import com.nagp.customer.repository.CustomerRepository;
import com.nagp.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(CreateCustomerRequest createCustomerRequest) {
        Customer customer = new Customer();
        customer.setName(createCustomerRequest.getName());
        return customerRepository.save(customer);
    }
}
