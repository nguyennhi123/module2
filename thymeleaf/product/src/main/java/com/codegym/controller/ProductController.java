package com.codegym.controller;

import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
private ProductService productService = new ProductServiceImpl();
@GetMapping("/home")
    public String index(Model model){
    model.addAttribute("products",productService.findAll());
    return "index";
}
}
