package com.codegym.service;

import com.codegym.model.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employees> findAll(Pageable pageable);
    Employees findById(Long id);
    void save(Employees employees);
    void remove(Long id);
    Page<Employees>findAllByName(String name, Pageable pageable);
    Page<Employees>findAllByNameContaining(String name,Pageable pageable);
}
