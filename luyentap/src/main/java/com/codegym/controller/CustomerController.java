package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
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
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "/customer",produces = "application/json;charset=UTF-8")
    public ModelAndView listCustomers(@RequestParam("s") Optional<String> s, Pageable pageable){
        Page<Customer> customers;
        if (s.isPresent()){
            customers = customerService.findAllByNameContaining(s.get(),pageable);
        }else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("home/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping(value = "/create-customer",produces = "application/json;charset=UTF-8")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("home/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @PostMapping(value = "/create-customer",produces = "application/json;charset=UTF-8")
    public ModelAndView saveCreate(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult){
        try {
            if (bindingResult.hasFieldErrors()){
                ModelAndView modelAndView = new ModelAndView("home/create");
                return modelAndView;
            }else {
                customerService.save(customer);
                ModelAndView modelAndView = new ModelAndView("home/create");
                modelAndView.addObject("customer",new Customer());
                modelAndView.addObject("message","create successfully");
                return modelAndView;
            }
        }catch (Exception e){
            ModelAndView modelAndView = new ModelAndView("home/create");
            modelAndView.addObject("message1","already exist");
            return modelAndView;
        }

    }
    @GetMapping(value = "/edit-customer/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView showFormEdit(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer!=null){
            ModelAndView modelAndView = new ModelAndView("home/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("home/error404");
            return modelAndView;
        }
    }
    @PostMapping(value ="/edit-customer",produces = "application/json;charset=UTF-8" )
    public ModelAndView updateCustomer(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult){
        try {
            if (bindingResult.hasFieldErrors()){
                 ModelAndView modelAndView = new ModelAndView("home/edit");
                 return modelAndView;
            }else {
                customerService.save(customer);
                ModelAndView modelAndView = new ModelAndView("home/edit");
                modelAndView.addObject("customers",customer);
                modelAndView.addObject("message","update successfully ");
                return modelAndView;
            }
        }catch (Exception e){
            ModelAndView modelAndView = new ModelAndView("home/edit");
            modelAndView.addObject("message1","already exist");
            return modelAndView;

        }
    }
    @GetMapping("/delete-customer/{id}")
    public String deleteCustomer(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer!=null){
            customerService.remove(customer.getId());
            return "redirect:/customer";

        }return "home/error404";
    }

}
