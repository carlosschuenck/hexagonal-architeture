package com.customer.core.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.domain.Customer;
import com.customer.core.ports.inbound.ICustomerService;
import com.customer.core.ports.outbound.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository repository;

	public Customer create(Customer customer) {
		return repository.create(customer);
	}

	public Customer update(Customer customer) {
		return repository.update(customer);
	}

	public List<Customer> findAll() {
		return repository.findAll();
	}

	public void delete(Customer customer) {
		repository.delete(customer);
	}

}
