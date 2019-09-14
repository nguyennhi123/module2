package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import com.codegym.repository.NewspaperRepository;
import com.codegym.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class NewspaperServiceImpl implements NewspaperService {
    @Autowired
    NewspaperRepository newspaperRepository;

    @Override
    public Page<Newspaper> findAll(Pageable pageable) {
        pageable = new PageRequest(pageable.getPageNumber(),5);
        return newspaperRepository.findAll(pageable);
    }

    @Override
    public Newspaper findById(Long id) {
        return newspaperRepository.findOne(id);
    }

    @Override
    public void save(Newspaper newspaper) {
        newspaperRepository.save(newspaper);

    }

    @Override
    public void remove(Long id) {
        newspaperRepository.delete(id);

    }

    @Override
    public Iterable<Newspaper> findAllByCategory(Category category) {
        return newspaperRepository.findAllByCategory(category);
    }

    @Override
    public Page<Newspaper> findAllByTittleContaining(String tittleEn, Pageable pageable) {
        return newspaperRepository.findAllByTittleContaining(tittleEn,pageable);
    }

}
