package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Name {
    @RequestMapping("/home")
    public String detail(){
        return "index";
    }
    @RequestMapping("detail/{ten}/{tuoi}/{gioitinh}")
    public String detailPeople(@PathVariable String ten, @PathVariable int tuoi, @PathVariable String gioitinh, Model model){
        model.addAttribute("ten",ten);
        model.addAttribute("tuoi",tuoi);
        model.addAttribute("gioitinh",gioitinh);
        return "detail";


    }
}
