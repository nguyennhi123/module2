package com.codegym.repository;

import com.codegym.model.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employees,Long> {
    Page<Employees> findAllByName(String name, Pageable pageable);
    //@Query("select e from e ")
    Page<Employees> findAllByNameContaining(String name,Pageable pageable);
}
