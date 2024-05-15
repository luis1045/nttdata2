package com.proyecto2.empresas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@Slf4j
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/allcompany")
    public ResponseEntity<Flux<Company>> allPerson(){
        Flux<Company> response=this.companyService.allCompany();
        return new ResponseEntity<Flux<Company>>(response, HttpStatus.OK);
    }

    @PostMapping("/addcompany")
    public  ResponseEntity<Mono<Company>> addPerson(@RequestBody Company company){

        Mono<Company> response = this.companyService.addCompany(company);
        return new ResponseEntity<Mono<Company>>(response, HttpStatus.OK);
    }
    @PutMapping("/updatecompany")
    public  ResponseEntity<Mono<Company>> updatePerson(@RequestBody Company company){

        Mono<Company> response = this.companyService.addCompany(company);
        return new ResponseEntity<Mono<Company>>(response, HttpStatus.OK);
    }

    @GetMapping("/findcompany/{id}")
    public ResponseEntity<Mono<Company>> findPerson( @PathVariable String ruc){
        Mono<Company> response=this.companyService.findCompany(ruc);
        return new ResponseEntity<Mono<Company>>(response, HttpStatus.OK);
    }
    @DeleteMapping("/deletecompany")
    public  ResponseEntity<Mono<Void>> deletePerson(@PathVariable String ruc){
        Mono<Void> response = this.companyService.deleteCompany(ruc);
        return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
    }

    @GetMapping("/checkaccount/{id}")
    public ResponseEntity<Mono<Company>> checkAccount(@PathVariable String id){
        Mono<Company> response = this.companyService.checkCompany(id);
        return new ResponseEntity<Mono<Company>>(response, HttpStatus.OK);
    }

}
