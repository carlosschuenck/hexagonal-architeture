package com.customer.customerapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teste")
public class Teste {
  
  @GetMapping()
  public String teste(){
    return "terste";
  }
}
