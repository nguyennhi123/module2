package com.codegym.repository;

import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TintucRepository extends PagingAndSortingRepository<Tintuc,Long> {
    Iterable<Tintuc>findAllByTheloai(Theloai theloai);
    Page<Tintuc>findAllByTittleContaining(String tittle, Pageable pageable);
}
