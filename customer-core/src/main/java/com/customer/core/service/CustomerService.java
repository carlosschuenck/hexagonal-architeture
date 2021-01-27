package com.customer.core.service;

import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.domain.Customer;
import com.customer.core.exception.BusinessException;
import com.customer.core.ports.inbound.ICustomerService;
import com.customer.core.ports.outbound.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository repository;

	public Customer create(Customer customer) {
		validateRequiredFields(customer);
		return repository.create(customer);
	}

	public Customer update(Customer customer) {
		validateIfExist(customer);
		validateRequiredFields(customer);
		return repository.update(customer);
	}

	public List<Customer> findAll() {
		return repository.findAll();
	}

	public void delete(Customer customer) {
		repository.delete(customer);
	}
	
	private void validateIfExist(Customer customer) {
		if(customer.getId() == null)
			throw new BusinessException("Customer id must be informed");
		if(!repository.findById(customer.getId()).isPresent())
			throw new BusinessException("Customer not exist");
	}

	private void validateRequiredFields(Customer customer) {
		if(customer == null)
			throw new BusinessException("Customer must be informed");
		if(Strings.isBlank(customer.getNome()))
			throw new BusinessException("Customer's name must be informed");
		if(Strings.isBlank(customer.getCpf()))
			throw new BusinessException("Customer's CPF must be informed");
	}

}
