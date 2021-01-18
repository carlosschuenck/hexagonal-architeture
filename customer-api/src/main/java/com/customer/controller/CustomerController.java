package com.customer.customerapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ch.qos.logback.core.net.server.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @GetMapping
    public List<String[]> findAll() {
        ArrayList<String[]> lista = new ArrayList<>();
        lista.add(new String[] { "1", "nome 1", "cpf 1" });
        lista.add(new String[] { "2", "nome 2", "cpf 2" });
        lista.add(new String[] { "3", "nome 3", "cpf 3" });
        lista.add(new String[] { "4", "nome 4", "cpf 4" });
        lista.add(new String[] { "5", "nome 5", "cpf 5" });
        return lista;
    }

    @PostMapping
    public String create() {
        return "Salvou";
    }

    @PutMapping
    public String update() {
        return "atualizou";
    }

    @DeleteMapping
    public String delete(@RequestBody UUID id) {
        return "Excluido";
    }
    
}