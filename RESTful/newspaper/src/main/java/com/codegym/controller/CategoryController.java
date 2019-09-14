package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.model.Theloai;
import com.codegym.model.Tintuc;
import com.codegym.service.CategoryService;
import com.codegym.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CategoryController {
    @Autowired
    private NewspaperService newspaperService;

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/categories")
    public ModelAndView listCategory(){
        Iterable<Category> category = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categories", category);
        return modelAndView;
    }


    @GetMapping("/create-category")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Theloai());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView saveCategory(@Validated @ModelAttribute("category") Category category, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/category/create");
            return modelAndView;
        }
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Theloai());
        modelAndView.addObject("message", "New category created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-category/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Category category = categoryService.finById(id);
        if(category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-category")
    public ModelAndView updateCategory(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            return modelAndView;
        }
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "category updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-category/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Category category = categoryService.finById(id);
        if(category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category", category);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-category")
    public String deleteCategory(@ModelAttribute("category") Theloai category){
        categoryService.remove(category.getId());
        return "redirect:categories";
    }

    @GetMapping("/view-categoryEn/{id}")
    public ModelAndView viewCategoryEn(@PathVariable("id") Long id){
        Category category = categoryService.finById(id);
        if(category == null){
            return new ModelAndView("/error.404");
        }

        Iterable<Newspaper> newspapers = newspaperService.findAllByCategory(category);

        ModelAndView modelAndView = new ModelAndView("category/viewen");
        modelAndView.addObject("category", category);
        modelAndView.addObject("newspaper", newspapers);
        return modelAndView;
    }
    @GetMapping("/view-categoryVi/{id}")
    public ModelAndView viewCategoryVi(@PathVariable("id") Long id){
        Category category = categoryService.finById(id);
        if(category == null){
            return new ModelAndView("/error.404");
        }

        Iterable<Newspaper> newspapers = newspaperService.findAllByCategory(category);

        ModelAndView modelAndView = new ModelAndView("category/viewvi");
        modelAndView.addObject("category", category);
        modelAndView.addObject("newspaper", newspapers);
        return modelAndView;
    }
}
