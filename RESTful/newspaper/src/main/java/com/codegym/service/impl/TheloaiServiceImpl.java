package com.codegym.service.impl;

import com.codegym.model.Theloai;
import com.codegym.repository.TheloaiRepository;
import com.codegym.service.TheloaiService;
import org.springframework.beans.factory.annotation.Autowired;

public class TheloaiServiceImpl implements TheloaiService {
    @Autowired
    TheloaiRepository theloaiRepository;
    @Override
    public Iterable<Theloai> findAll() {
        return theloaiRepository.findAll();
    }

    @Override
    public void save(Theloai theloai) {
        theloaiRepository.save(theloai);

    }

    @Override
    public void remove(Long id) {
        theloaiRepository.delete(id);

    }

    @Override
    public Theloai finById(Long id) {
        return theloaiRepository.findOne(id);
    }
}
