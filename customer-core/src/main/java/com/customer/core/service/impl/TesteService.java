package com.customer.core.service.impl;

import org.springframework.stereotype.Service;

import com.customer.core.service.ITesteService;

@Service
public class TesteService implements ITesteService {
  
  public String teste(){
    return "Testando service...";
  }
}
