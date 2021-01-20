package com.customer.core.service;

import com.customer.core.entity.Customer;

import java.util.List;
import java.util.UUID;

public interface ICustomerService {
	Customer create();
	Customer update();
	List<Customer> findAll();
	void delete(UUID id);
}
