package com.customer.core.ports.outbound;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.customer.core.domain.Customer;

public interface ICustomerRepository {

	Customer create(Customer customer);
	Customer update(Customer customer);
	Optional<Customer> findById(UUID id);
    List<Customer> findAll();
    void delete(UUID id);
}
