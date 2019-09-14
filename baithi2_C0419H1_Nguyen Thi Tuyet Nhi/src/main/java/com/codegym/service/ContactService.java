package com.codegym.service;

import com.codegym.model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContactService {
    Page<Contact>findAll(Pageable pageable);
    Contact findById(Long id);
    void save(Contact contact);
    void remove(Long id);
    Page<Contact>findAllByFirstNameOrLastNameContaining(String firstName,String lastName,Pageable pageable);
}
