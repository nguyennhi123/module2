package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Detail {
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping("/result/{ten}/{tuoi}/{gioitinh}")
    public String name(@PathVariable String ten,@PathVariable int tuoi,@PathVariable String gioitinh,Model model){
        model.addAttribute("ten",ten);
        model.addAttribute("tuoi",tuoi);
        model.addAttribute("gioitinh",gioitinh);
        return "detail";
    }

}
