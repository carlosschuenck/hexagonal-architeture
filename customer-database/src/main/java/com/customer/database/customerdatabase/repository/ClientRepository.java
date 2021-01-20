package com.customer.database.customerdatabase.repository;

import com.customer.core.entity.Customer;
import com.customer.core.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClientRepository implements ICustomerRepository {

    @Override
    public List<Customer> findAll() {
        ArrayList<Customer> lista = new ArrayList<>();
        lista.add(new Customer(UUID.randomUUID(), "Carlos","152.632.659-51"));
        lista.add(new Customer(UUID.randomUUID(),"Stevam","146.978.421-09"));
        return lista;
    }

    @Override
    public Customer create() {
        return null;
    }

    @Override
    public Customer update() {
        return null;
    }

    @Override
    public void delete(UUID id){}
}
