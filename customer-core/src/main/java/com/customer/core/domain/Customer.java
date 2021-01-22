package com.customer.core.domain;

import java.util.UUID;

import lombok.Data;

@Data
public class Customer {
    
	private UUID id;
    
	private String nome;

	private String cpf;
}
