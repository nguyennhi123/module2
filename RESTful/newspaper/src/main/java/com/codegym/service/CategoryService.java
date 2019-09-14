package com.codegym.service;

import com.codegym.model.Category;

public interface CategoryService {
    Iterable<Category>findAll();
    void save(Category category);
    void remove(Long id);
    Category finById(Long id);

}
