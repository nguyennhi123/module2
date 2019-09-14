package com.codegym.repository;

import java.util.List;

public interface Repository<T> {
    List<T>findAll();
    T findById(Long id);
    void remove(Long id);
    void save(T model);

}
