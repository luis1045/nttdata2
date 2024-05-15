package com.proyecto2.empresas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyRepo companyRepo;
    @Override
    public Flux<Company> allCompany() {

        return this.companyRepo.findAll();
    }

    @Override
    public Mono<Company> addCompany(Company company) {
        return this.companyRepo.save(company);
    }

    @Override
    public Mono<Company> updateCompany(Company company) {
        return this.companyRepo.save(company);
    }

    @Override
    public Mono<Company> findCompany(String ruc) {
        return this.companyRepo.findById(ruc);
    }

    @Override
    public Mono<Void> deleteCompany(String ruc) {
        return this.companyRepo.deleteById(ruc);
    }

    @Override
    public Mono<Company> checkCompany(String ruc) {
        return this.companyRepo.findById(ruc);
    }
}
