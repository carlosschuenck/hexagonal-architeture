package com.customer.database.adapter;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.domain.Customer;
import com.customer.core.ports.outbound.ICustomerRepository;
import com.customer.database.repository.CustomerRepository;

@Service
public class CustomerAdapter implements ICustomerRepository {
	
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Customer create(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public void delete(UUID id) {
		repository.deleteById(id);
	}

}
