package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Newspaper;
import com.codegym.service.CategoryService;
import com.codegym.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;
@Controller
public class NewspaperController {
    @Autowired
    private NewspaperService newspaperService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    @GetMapping("/newspapersEn")
    public ModelAndView listNewspapersEn(@RequestParam("sE") Optional<String> sE, Pageable pageable) {
        Page<Newspaper> newspapers;
        if (sE.isPresent()) {
            newspapers = newspaperService.findAllByTittleEnContaining(sE.get(), pageable);
        } else {
            newspapers = newspaperService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/newspaper/listEn");
        modelAndView.addObject("newspapers", newspapers);
        return modelAndView;
    }
    @GetMapping("/newspapersVi")
    public ModelAndView listNewspapersVi(@RequestParam("sV") Optional<String> sV, Pageable pageable) {
        Page<Newspaper> newspapers;
        if (sV.isPresent()) {
            newspapers = newspaperService.findAllByTittleViContaining(sV.get(), pageable);
        } else {
            newspapers = newspaperService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/newspaper/listVi");
        modelAndView.addObject("newspapers", newspapers);
        return modelAndView;
    }
    @GetMapping("/create-newspaper")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("newspaper/create");
        modelAndView.addObject("newspaper",new Newspaper());
        return modelAndView;
    }
    @PostMapping("/create-newspaper")
    public ModelAndView saveNewspaper(@Validated @ModelAttribute("newspaper") Newspaper newspaper, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("newspaper/create");
            return modelAndView;
        }
        newspaperService.save(newspaper);
        ModelAndView modelAndView = new ModelAndView("newspaper/create");
        modelAndView.addObject("newspaper",new Newspaper());
        modelAndView.addObject("message","New blog created successfully");
        return modelAndView;
    }
    @GetMapping("/edit-newspaper/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Newspaper newspaper = newspaperService.findById(id);
        if(newspaper != null) {
            ModelAndView modelAndView = new ModelAndView("/newspaper/edit");
            modelAndView.addObject("newspaper", newspaper);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-newspaper")
    public ModelAndView updateNewspaper(@Valid @ModelAttribute("newspaper") Newspaper newspaper, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("newspaper/edit");
            return modelAndView;
        }
        newspaperService.save(newspaper);
        ModelAndView modelAndView = new ModelAndView("/newspaper/edit");
        modelAndView.addObject("newspaper", newspaper);
        modelAndView.addObject("message", "newspaper updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-newspaper/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Newspaper newspaper = newspaperService.findById(id);
        if(newspaper != null) {
            ModelAndView modelAndView = new ModelAndView("/newspaper/delete");
            modelAndView.addObject("newspaper", newspaper);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-newspaper")
    public String deleteNewspaper(@ModelAttribute("newspaper") Newspaper newspaper){
        newspaperService.remove(newspaper.getId());
        return "redirect:newspapersVi";
    }

}
