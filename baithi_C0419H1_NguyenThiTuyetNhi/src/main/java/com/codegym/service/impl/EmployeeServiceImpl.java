package com.codegym.service.impl;

import com.codegym.model.Employees;
import com.codegym.repository.EmployeeRepository;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employees> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employees findById(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void save(Employees employees) {
        employeeRepository.save(employees);

    }

    @Override
    public void remove(Long id) {
        employeeRepository.delete(id);

    }
    @Override
    public Page<Employees> findAllByName(String name, Pageable pageable) {
        return employeeRepository.findAllByName(name,pageable);
    }

    @Override
    public Page<Employees> findAllByNameContaining(String name, Pageable pageable) {
        return employeeRepository.findAllByNameContaining(name,pageable);
    }
}
