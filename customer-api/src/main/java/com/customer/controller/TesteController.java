package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.core.service.ITesteService;

@RestController
@RequestMapping("/teste")
public class TesteController {
  
  @Autowired
  private ITesteService testeService;
	
  @GetMapping
  public String testando(){
    return testeService.teste();
  }
}
