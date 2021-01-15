package com.customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class CustomerController {

    @GetMapping(value = "/get")
    public List<String[]> findAll() {
        ArrayList<String[]> lista = new ArrayList<>();
        lista.add(new String[] { "1", "nome 1", "cpf 1" });
        lista.add(new String[] { "2", "nome 2", "cpf 2" });
        lista.add(new String[] { "3", "nome 3", "cpf 3" });
        lista.add(new String[] { "4", "nome 4", "cpf 4" });
        lista.add(new String[] { "5", "nome 5", "cpf 5" });
        return lista;
    }

    @PostMapping(value = "/post")
    public String create() {
        return "Salvou";
    }

    @PutMapping(value = "/put")
    public String update() {
        return "atualizou";
    }

    @DeleteMapping(value="/delete")
    public String delete(@RequestBody UUID id) {
        return "Excluido";
    }
    
}