package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Product {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping("result/{name}/{id}/{type}")
    public String result(@PathVariable String name, @PathVariable int id, @PathVariable String type, Model model){
        model.addAttribute("name",name);
        model.addAttribute("id",id);
        model.addAttribute("type",type);
        return "detail";
    }
}
