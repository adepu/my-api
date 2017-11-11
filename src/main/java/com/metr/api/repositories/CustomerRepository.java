package com.metr.api.repositories;

import com.metr.api.models.Customer;

public interface CustomerRepository {

    Customer getCustomerById(Integer id);
}
