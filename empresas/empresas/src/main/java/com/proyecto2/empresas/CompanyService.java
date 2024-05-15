package com.proyecto2.empresas;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompanyService {

    public Flux<Company> allCompany();
    public Mono<Company> addCompany(Company company);
    public Mono<Company> updateCompany(Company company);
    public Mono<Company> findCompany(String ruc);
    public Mono<Void> deleteCompany(String ruc);
    public Mono<Company> checkCompany(String ruc);

}
