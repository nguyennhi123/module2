package com.codegym.service.impl;

import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import com.codegym.repository.TintucRepository;
import com.codegym.service.TintucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TintucServiceImpl implements TintucService {
    @Autowired
    TintucRepository tintucRepository;
    @Override
    public Page<Tintuc> findAll(Pageable pageable) {
        return tintucRepository.findAll(pageable);
    }

    @Override
    public Tintuc findById(Long id) {
        return tintucRepository.findOne(id);
    }

    @Override
    public void save(Tintuc tintuc) {
        tintucRepository.save(tintuc);

    }

    @Override
    public void remove(Long id) {
        tintucRepository.delete(id);

    }

    @Override
    public Iterable<Tintuc> findAllByTheloai(Theloai theloai) {
        return tintucRepository.findAllByTheloai(theloai);
    }

    @Override
    public Page<Tintuc> findAllByTittleContaining(String tittle, Pageable pageable) {
        return tintucRepository.findAllByTittleContaining(tittle,pageable);
    }
}
