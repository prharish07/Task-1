package com.p4p.iglulabs.task.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.p4p.iglulabs.task.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
    Optional<Customer> findById(Long id);
} 
