package com.codegym.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SercurityController {
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String adminPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "admin/index";
    }
    @GetMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public String getLogin() {
        return "admin/login";
    }
}
