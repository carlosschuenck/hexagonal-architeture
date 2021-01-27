package com.customer.database.adapter;

import java.util.List;
import java.util.UUID;

import com.customer.database.dto.CustomerDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.core.domain.Customer;
import com.customer.core.ports.outbound.ICustomerRepository;
import com.customer.database.repository.CustomerRepository;

@Service
public class CustomerAdapter implements ICustomerRepository {

    @Autowired
    private CustomerRepository repository;
    @Autowired
	private ModelMapper modelMapper;

	@Override
    public List<Customer> findAll() {
	    List<CustomerDTO> customerDTOList = repository.findAll();
        return modelMapper.map(customerDTOList, new TypeToken<List<Customer>>(){}.getType());
    }

    @Override
    public Customer create(Customer customer) {
		CustomerDTO customerDTO =  repository.save(modelMapper.map(customer, CustomerDTO.class));
		return modelMapper.map(customerDTO, Customer.class);
    }

    @Override
    public Customer update(Customer customer) {
		return create(customer);
    }

    @Override
    public void delete(Customer customer) { repository.delete(modelMapper.map(customer, CustomerDTO.class));
    }

}
