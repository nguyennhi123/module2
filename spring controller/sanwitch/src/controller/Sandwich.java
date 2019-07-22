package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Sandwich {
    @GetMapping(value = "/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/condiment",method = RequestMethod.GET)
    public String condiment(@RequestParam ("condiment") String[]condiment, Model model){
        model.addAttribute("result",condiment);
        return "home";
    }
}
