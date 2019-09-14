package com.codegym.controller;

import com.codegym.reponse.Customer;
import com.codegym.request.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/customer")
    public String register (@ModelAttribute("register")Register register){
        return "customer";
    }
    @PostMapping("/customer")
    public String customer(@ModelAttribute("register")Register register, Model model){
        Customer customer = new Customer();
        customer.setAddress(register.getAddress());
        customer.setFirstName(register.getFirstName());
        customer.setLastName(register.getLastName());
        model.addAttribute("customer",customer);
        return "register";

    }
}
