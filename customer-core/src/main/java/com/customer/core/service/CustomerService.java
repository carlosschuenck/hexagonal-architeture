package com.customer.core.service;

import java.util.UUID;

public class CustomerService {
  public String save() {
    return "Registro criado";
  }

  public String upadate() {
    return "Atualizado";
  }

  public String findAll() {
    return "todos";
  }

  public String delete(UUID id) {
    return "Registro excluido";
  }
}
