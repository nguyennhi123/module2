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

    @GetMapping(value = "/newspapersEn",produces = "application/json;charset=UTF-8")
    public ModelAndView listNewspapersEn(@RequestParam("s") Optional<String> sE, Pageable pageable) {
        Page<Newspaper> newspapers;
        if (sE.isPresent()) {
            newspapers = newspaperService.findAllByTittleEnContaining(sE.get(), pageable);
        } else {
            newspapers = newspaperService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/admin/newspaper");
        modelAndView.addObject("newspapers", newspapers);
        return modelAndView;
    }
    @GetMapping(value = "/newspapersVi",produces = "application/json;charset=UTF-8")
    public ModelAndView listNewspapersVi(@RequestParam("s") Optional<String> sV, Pageable pageable) {
        Page<Newspaper> newspapers;
        if (sV.isPresent()) {
            newspapers = newspaperService.findAllByTittleViContaining(sV.get(), pageable);
        } else {
            newspapers = newspaperService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/admin/newspapervi");
        modelAndView.addObject("newspapers", newspapers);
        return modelAndView;
    }
    @GetMapping(value = "/create-newspaper",produces = "application/json;charset=UTF-8")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("newspaper/create");
        modelAndView.addObject("newspaper",new Newspaper());
        return modelAndView;
    }
    @PostMapping(value = "/create-newspaper",produces = "application/json;charset=UTF-8")
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
    @GetMapping(value = "/edit-newspaper/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView showEditForm(@PathVariable Long id){
        Newspaper newspaper = newspaperService.findById(id);
        if(newspaper != null) {
            ModelAndView modelAndView = new ModelAndView("/newspaper/edit");
            modelAndView.addObject("newspaper", newspaper);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/admin/404");
            return modelAndView;
        }
    }

    @PostMapping(value = "/edit-newspaper",produces = "application/json;charset=UTF-8")
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
    @GetMapping(value = "/delete-newspaper/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Newspaper newspaper = newspaperService.findById(id);
        if(newspaper != null) {
            ModelAndView modelAndView = new ModelAndView("/newspaper/delete");
            modelAndView.addObject("newspaper", newspaper);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/admin/404");
            return modelAndView;
        }
    }

    @PostMapping(value = "/delete-newspaper",produces = "application/json;charset=UTF-8")
    public String deleteNewspaper(@ModelAttribute("newspaper") Newspaper newspaper){
        newspaperService.remove(newspaper.getId());
        return "redirect:newspapersVi";
    }

}
