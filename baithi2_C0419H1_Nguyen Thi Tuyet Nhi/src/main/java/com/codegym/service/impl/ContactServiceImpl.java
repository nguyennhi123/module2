package com.codegym.service.impl;

import com.codegym.model.Contact;
import com.codegym.repository.ContactRepository;
import com.codegym.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public Page<Contact> findAll(Pageable pageable) {
        return contactRepository.findAll(pageable);
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);

    }

    @Override
    public void remove(Long id) {
        contactRepository.delete(id);

    }

    @Override
    public Page<Contact> findAllByFirstNameOrLastNameContaining(String firstName, String lastName, Pageable pageable) {
        return contactRepository.findAllByFirstNameOrLastNameContaining(firstName,lastName,pageable);
    }


}
