package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "result",method = RequestMethod.GET)
        public String convert(@RequestParam double usd, Model model){
        double result = usd*23000;
        model.addAttribute("result",result);
        return "index";
    }
}
