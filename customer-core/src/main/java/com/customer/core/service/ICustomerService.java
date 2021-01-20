package com.customer.core.service;

import java.util.List;
import java.util.UUID;

public interface ICustomerService {
	public String save();
	public String upadate();
	public List<String[]> findAll();
	public String delete(UUID id);
}
