package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface NewspaperRepository extends PagingAndSortingRepository<Newspaper,Long> {
    Iterable<Newspaper>findAllByCategory(Category category);
    Page<Newspaper>findAllByTittleContaining(String tittle, Pageable pageable);


}
