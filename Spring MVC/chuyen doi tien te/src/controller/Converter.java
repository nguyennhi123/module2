package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/home")
    public String home(){
        return "index";

    }
    @RequestMapping(value = "/convert",method = RequestMethod.POST)
    public String convert(@RequestParam double usd,Model model){
        double covert = usd*23000;
        model.addAttribute("result",covert);
        return "index";

    }
}
