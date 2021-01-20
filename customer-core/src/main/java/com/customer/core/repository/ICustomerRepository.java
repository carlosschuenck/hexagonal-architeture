package com.customer.core.repository;

import com.customer.core.entity.Customer;

import java.util.List;
import java.util.UUID;

public interface ICustomerRepository {

    List<Customer> findAll();
    Customer create();
    Customer update();
    void delete(UUID id);
}
