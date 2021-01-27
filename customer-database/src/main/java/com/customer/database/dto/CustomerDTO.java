package com.customer.database.dto;

import javax.persistence.*;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class CustomerDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    private String cpf;

}
