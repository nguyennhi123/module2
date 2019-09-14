package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TintucService {
    Page<Tintuc> findAll(Pageable pageable);
    Tintuc findById(Long id);
    void save(Tintuc tintuc);
    void remove(Long id);
    Iterable<Tintuc> findAllByTheloai(Theloai theloai);
    Page<Tintuc>findAllByTittleContaining(String tittle, Pageable pageable);
}
