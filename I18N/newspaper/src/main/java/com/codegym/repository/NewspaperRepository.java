package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface NewspaperRepository extends PagingAndSortingRepository<Newspaper,Long> {
    Iterable<Newspaper>findAllByCategory(Category category);
    Page<Newspaper>findAllByTittleEnContaining(String tittleEn, Pageable pageable);
    Page<Newspaper>findAllByTittleViContaining(String tittleVi,Pageable pageable);
    //Iterable<Newspaper>queryTop5ByCategory_IdOrderByIdDesc();
    Iterable<Newspaper> queryTop3ByOrderByIdDesc ();
}
