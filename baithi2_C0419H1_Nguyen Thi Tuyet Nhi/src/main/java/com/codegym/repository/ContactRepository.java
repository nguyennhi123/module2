package com.codegym.repository;

import com.codegym.model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContactRepository extends PagingAndSortingRepository<Contact,Long> {
    Page<Contact>findAllByFirstNameOrLastNameContaining(String firstName,String lastName, Pageable pageable);
}
