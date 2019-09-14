package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.service.CategoryService;
import com.codegym.service.NewspaperService;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class HomeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    NewspaperService newspaperService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    //    public ModelAndView home(){
//        Iterable<Category> categoryIterable = categoryService.findAll();
//        List<Newspaper> rtList = new ArrayList<>();
//        for (Category c : categoryIterable) {
//            rtList.addAll(ImmutableList.copyOf(newspaperService.queryTop5ByCategory_IdOrderByIdDesc(c.getId())));
//        }
//        if (rtList != null) {
//            ModelAndView modelAndView = new ModelAndView("/home/index");
//            modelAndView.addObject("posts", rtList);
//            return modelAndView;
//        }


    @GetMapping(value = "/home",produces = "application/json;charset=UTF-8")
    public ModelAndView home(@RequestParam("s") Optional<String> sE, Pageable pageable) {
        Page<Newspaper> newspapers;
        if (sE.isPresent()) {
            newspapers = newspaperService.findAllByTittleEnContaining(sE.get(), pageable);
        } else {
            newspapers = newspaperService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/home/index");
        modelAndView.addObject("newspapers", newspapers);
        return modelAndView;
    }

/*    @GetMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("admin/login");
        return modelAndView;
    }*/
    @GetMapping(value = "/view-newspaperEn/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView postDetail(@PathVariable Long id)
                                   //@PageableDefault(size = 20) Pageable pageable)
                                   {
//        if (s.isPresent()) {
//            Page<Newspaper> resultList = newspaperService.findAllByTittleEnContaining(s.get(), pageable);
//            ModelAndView modelAndView = new ModelAndView("assets/search");
//            modelAndView.addObject("posts", resultList);
//            return modelAndView;
//        } else {
            Newspaper newspaper = newspaperService.findById(id);
            if (newspaper == null) {
                ModelAndView modelAndView = new ModelAndView("/home/error404");
                return modelAndView;
            }
            ModelAndView modelAndView = new ModelAndView("/home/view");
            modelAndView.addObject("newspapers", newspaper);
            return modelAndView;
        }
    }

