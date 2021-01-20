package com.customer.core.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.customer.core.entity.Customer;
import com.customer.core.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;
	
  public Customer create() {
    return iCustomerRepository.create();
  }

  public Customer update() {
    return iCustomerRepository.update();
  }

  public List<Customer> findAll() {
      return iCustomerRepository.findAll();
  }

  public void delete(UUID id) {
    iCustomerRepository.delete(id);
  }
  
}
