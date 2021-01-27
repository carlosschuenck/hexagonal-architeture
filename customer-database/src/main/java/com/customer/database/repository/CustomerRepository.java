package com.customer.database.repository;

import java.util.UUID;

import com.customer.database.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.core.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDTO, UUID>{}
