package com.proyecto2.empresas;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends ReactiveMongoRepository<Company,String> {
}
