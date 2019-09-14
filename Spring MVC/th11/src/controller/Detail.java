package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Detail {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping("result/{email}/{address}")
    public String detail(@PathVariable String email, @PathVariable String address, Model model){
        model.addAttribute("home",email);
        model.addAttribute("address",address);
        return "index";
    }
}
