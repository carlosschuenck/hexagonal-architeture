package com.customer.core.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.customer.core.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	
  public String save() {
    return "Registro criado";
  }

  public String upadate() {
    return "Atualizado";
  }

  public List<String[]> findAll() {
	  ArrayList<String[]> lista = new ArrayList<>();
      lista.add(new String[] { "1", "nome 1", "cpf 1" });
      lista.add(new String[] { "2", "nome 2", "cpf 2" });
      lista.add(new String[] { "3", "nome 3", "cpf 3" });
      lista.add(new String[] { "4", "nome 4", "cpf 4" });
      lista.add(new String[] { "5", "nome 5", "cpf 5" });
      return lista;
  }

  public String delete(UUID id) {
    return "Registro excluido";
  }
  
}
