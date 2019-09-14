package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String convert(@RequestParam String key, Model model){
        Map<String,String>map = new HashMap<>();
        map.put("hi","chao");
        map.put("love","yeu");
        Boolean result = map.containsKey(key);
        if (result){
model.addAttribute("result",map.get(key));
        }else {
            model.addAttribute("result","not found");
        }
        return "index";


    }
}
