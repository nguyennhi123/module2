package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping("/")
    public String convertion(){
        return "convert";
    }
    @GetMapping("/convert")
public String convert(@RequestParam Double usd, Model model){
        double rate = 23000;
        double vnd = rate*usd;

        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("vnd",vnd);
        return "index";
    }
}
