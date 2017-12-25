package com.metr.api.services;

import com.metr.api.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
}
