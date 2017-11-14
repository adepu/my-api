package com.metr.api.repositories;

import com.metr.api.models.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer getCustomerById(Long customerId);

    List<Customer> getAllCustomers();

    void updateCustomer(Customer customer);

    void createCustomer(Customer customer);

    void deactivateCustomer(Long customerId);

    //PaymentDetails getCustomerPaymentDetails(Long customerId);

}
