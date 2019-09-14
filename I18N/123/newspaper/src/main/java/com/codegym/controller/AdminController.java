package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.CategoryService;
import com.codegym.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AdminController {
    @Autowired
    private NewspaperService newspaperService;

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/admin")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/admin/index");
        return modelAndView;
    }
    @GetMapping("/categories")
    public ModelAndView listCategory(){
        Iterable<Category> category = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/index");
        modelAndView.addObject("categories", category);
        return modelAndView;
    }
}
