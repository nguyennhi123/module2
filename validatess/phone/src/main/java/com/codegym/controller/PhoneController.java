package com.codegym.controller;

import com.codegym.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("phones",new Phone());
        return "index";

    }
    @PostMapping("/")
    public String checkValidate(@Valid @ModelAttribute("phones")Phone phone, BindingResult bindingResult,Model model){
        new Phone().validate(phone,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        model.addAttribute("phone",phone.getNumber());
        return "result";

    }
}
