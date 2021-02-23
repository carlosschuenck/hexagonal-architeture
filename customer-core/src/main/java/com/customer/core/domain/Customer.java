package com.customer.core.domain;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    
	private UUID id;
    
	private String nome;

	private String cpf;
}
