package com.proyecto2.empresas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Company")
public class Company {
    private String ruc;
    private String name;
    private String email;
    private List<Account> accounts;
    private List<Credit> credits;
}
