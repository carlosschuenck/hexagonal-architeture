package com.customer.core.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.customer.core.exception.BusinessException;
import com.customer.core.ports.outbound.ICustomerRepository;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTests {
	
	@InjectMocks
	private CustomerService service;
	
	@Mock
	private ICustomerRepository repository;
	
	@Test
	void createWithNullCustomerTest() {
		assertThrows(BusinessException.class, () -> {
			service.create(null);
		});
	}


}
