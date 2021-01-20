package com.customer.controller;

import java.util.List;
import java.util.UUID;

import com.customer.core.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.core.service.ICustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
    @GetMapping
    public List<Customer> findAll() {
       return customerService.findAll();
    }

    @PostMapping
    public Customer create() {
        return customerService.create();
    }

    @PutMapping
    public Customer update() {
        return customerService.update();
    }

    @DeleteMapping
    public void delete(@RequestBody UUID id) {
        customerService.delete(id);
    }
    
}