package com.codegym.controller;

import com.codegym.model.Contact;
import com.codegym.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;
    @GetMapping(value = "/list",produces = "application/json;charset=UTF-8")
    public ModelAndView listContacts(@RequestParam("s")Optional<String>s, Pageable pageable){
        Page<Contact>contacts;
        if (s.isPresent()){
            contacts = contactService.findAllByFirstNameOrLastNameContaining(s.get(),s.get(),pageable);

        }else {
            contacts = contactService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("contact/list");
        modelAndView.addObject("contact",contacts);
        return modelAndView;
    }
    @GetMapping(value = "/create-contact",produces = "application/json;charset=UTF-8")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("contact/create");
        modelAndView.addObject("contact",new Contact());
        return modelAndView;
    }
    @PostMapping(value ="/create-contact",produces = "application/json;charset=UTF-8" )
    public ModelAndView saveContact(@Valid @ModelAttribute("contact")Contact contact, BindingResult bindingResult){
        try {
            if (bindingResult.hasFieldErrors()){
                ModelAndView modelAndView = new ModelAndView("contact/create");
                return modelAndView;
            }else {
                contactService.save(contact);
                ModelAndView modelAndView = new ModelAndView("contact/create");
                modelAndView.addObject("contact",new Contact());
                modelAndView.addObject("message","New contact created successfully");
                return modelAndView;

            }
        }catch (Exception ex){
            ModelAndView modelAndView = new ModelAndView("/contact/create");
            modelAndView.addObject ( "message1","already exist" );
            return modelAndView;

        }
        }
    @GetMapping(value = "/edit-contact/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView showEditContact(@PathVariable Long id){
        Contact contact = contactService.findById(id);
        if (contact != null){
            ModelAndView modelAndView = new ModelAndView("/contact/edit");
            modelAndView.addObject("contact",contact);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("/404");
        return modelAndView;


    }
    @PostMapping(value = "/edit-contact",produces = "application/json;charset=UTF-8")
    public ModelAndView updateContact(@Valid @ModelAttribute("contact")Contact contact,BindingResult bindingResult){
        try {
            if (bindingResult.hasFieldErrors()){
                ModelAndView modelAndView = new ModelAndView("contact/edit");
                return modelAndView;
            }
            contactService.save(contact);
            ModelAndView modelAndView = new ModelAndView("/contact/edit");
            modelAndView.addObject("contact",contact);
            modelAndView.addObject("message","contact update");
            return modelAndView;
        }catch (Exception ex){
            ModelAndView modelAndView = new ModelAndView("/contact/edit");
            modelAndView.addObject ( "message1","already exist" );
            return modelAndView;
        }


    }
    @GetMapping("/delete-contact/{id}")
    public String showDeleteForm(@PathVariable Long id) {
        Contact contact = contactService.findById(id);
        if (contact != null) {
            contactService.remove(contact.getId());
            return "redirect:/list";
        }
        return "/404";
    }
}



