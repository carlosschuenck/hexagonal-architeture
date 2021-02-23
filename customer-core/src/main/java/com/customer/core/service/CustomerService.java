package com.customer.core.service;

import static org.apache.logging.log4j.util.Strings.isBlank;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.domain.Customer;
import com.customer.core.exception.BusinessException;
import com.customer.core.ports.inbound.ICustomerService;
import com.customer.core.ports.outbound.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	public static final String CUSTOMER_MUST_BE_INFORMED = "Customer must be informed";

	public static final String CUSTOMER_S_NAME_MUST_BE_INFORMED = "Customer's name must be informed";

	public static final String CUSTOMER_S_CPF_MUST_BE_INFORMED = "Customer's CPF must be informed";
	
	@Autowired
	private ICustomerRepository repository;

	public Customer create(Customer customer) {
		validateRequiredFields(customer);
		return repository.create(customer);
	}

	public Customer update(Customer customer) {
		validateRequiredFields(customer);
		validateIfExist(customer.getId());
		return repository.update(customer);
	}

	public List<Customer> findAll() {
		return repository.findAll();
	}

	public void delete(UUID id) {
		validateIfExist(id);
		repository.delete(id);
	}
	
	private void validateIfExist(UUID id) {
		if(id == null)
			throw new BusinessException("Customer id must be informed");
		if(!repository.findById(id).isPresent())
			throw new BusinessException("Customer not exist");
	}

	private void validateRequiredFields(Customer customer) {
		if(customer == null)
			throw new BusinessException(CUSTOMER_MUST_BE_INFORMED);
		if(isBlank(customer.getNome()))
			throw new BusinessException(CUSTOMER_S_NAME_MUST_BE_INFORMED);
		if(isBlank(customer.getCpf()))
			throw new BusinessException(CUSTOMER_S_CPF_MUST_BE_INFORMED);
	}
}
