package com.metr.api.repositories;

import com.metr.api.models.Customer;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerRespositoryImpl implements CustomerRepository {

    @Override
    public Customer getCustomerById(Integer id) {
        return getCustomer();
    }

    private Customer getCustomer(){
        DateTime currentTime = new DateTime();

        Customer customer = new Customer();
        customer.setFirstName("Bob");
        customer.setLastName("Doe");
        customer.setAddress1("123 Main St");
        customer.setAddress2("Apt 28");
        customer.setCity("Charlotte");
        customer.setState("NC");
        customer.setZip("28206");
        customer.setRenter(true);
        customer.setRentee(false);
        customer.setDateCreated(currentTime.minus(10));
        customer.setLastLogin(currentTime);

        return customer;
    }
}
