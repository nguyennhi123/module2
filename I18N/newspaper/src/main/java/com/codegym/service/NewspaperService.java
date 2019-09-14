package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NewspaperService {
    Page<Newspaper>findAll(Pageable pageable);
    Newspaper findById(Long id);
    void save(Newspaper newspaper);
    void remove(Long id);
    Iterable<Newspaper>findAllByCategory(Category category);
    Page<Newspaper>findAllByTittleEnContaining(String tittleEn, Pageable pageable);
    Page<Newspaper>findAllByTittleViContaining(String tittleVi,Pageable pageable);
    //Iterable<Newspaper>queryTop5ByCategory_IdOrderByIdDesc();
}
