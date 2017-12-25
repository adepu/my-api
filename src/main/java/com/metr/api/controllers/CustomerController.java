package com.metr.api.controllers;

import com.metr.api.models.Customer;
import com.metr.api.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable  Long id){

        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.POST)
    public void updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
        return;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.PUT)
    public void createCustomer(@RequestBody Customer customer){
        return;
    }

    @RequestMapping(value = "/customer/deactivate/{id}", method = RequestMethod.POST)
    public void deactivateCusotmer(@PathVariable Long id){
        return;
    }


}
