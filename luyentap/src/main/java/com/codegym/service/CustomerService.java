package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer>findAll(Pageable pageable);
    Customer findById(Long id);
    Page<Customer>findAllByNameContaining(String name,Pageable pageable);
    void remove(Long id);
    void save(Customer customer);
}
