package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NewspaperService {
    Page<Newspaper>findAll(Pageable pageable);
    Newspaper findById(Long id);
    void save(Newspaper newspaper);
    void remove(Long id);
    Iterable<Newspaper>findAllByCategory(Category category);
    Page<Newspaper>findAllByTittleContaining(String tittle, Pageable pageable);
}
