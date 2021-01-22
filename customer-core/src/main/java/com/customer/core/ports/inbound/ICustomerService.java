package com.customer.core.ports.inbound;

import java.util.List;
import java.util.UUID;

import com.customer.core.domain.Customer;

public interface ICustomerService {
	Customer create(Customer customer);
	Customer update(Customer customer);
	List<Customer> findAll();
	void delete(UUID id);
}
