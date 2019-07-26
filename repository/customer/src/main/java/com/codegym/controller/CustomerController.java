package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import com.codegym.service.CustomerService;
import com.codegym.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }
    @GetMapping("/customers")
    public ModelAndView listCustomers(){
        Iterable<Customer>customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
    @GetMapping("/create-customer")
    public ModelAndView showCreateCustomer(){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;

    }
    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customers",new Customer());
        modelAndView.addObject("message","New customer created successfully");
        return modelAndView;

    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditCustomer(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("/eror404");
        return modelAndView;


    }
    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer")Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("message","customer update");
        return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteCustomer(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("eror404");
        return modelAndView;

    }
    @PostMapping("/delete/customer")
    public String moveCustomer(@ModelAttribute("customer")Customer customer){
        customerService.remove(customer.getId());
        return "redirect:customers";
    }



}
