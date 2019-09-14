package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Theloai;

public interface TheloaiService {
    Iterable<Theloai>findAll();
    void save(Theloai theloai);
    void remove(Long id);
    Theloai finById(Long id);
}
