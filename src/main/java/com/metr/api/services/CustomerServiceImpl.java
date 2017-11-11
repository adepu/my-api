package com.metr.api.services;

import com.metr.api.models.Customer;
import com.metr.api.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(@Autowired CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.getCustomerById(id);
    }
}
