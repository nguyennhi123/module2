package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @RequestMapping("worldclock")
    public String TimeController(@RequestParam(name = "city",required = false,defaultValue = "asia/Ho_Chi_Minh")String city, Model model){
        Date date = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long local_time = date.getTime()+(local.getRawOffset()-locale.getRawOffset());
        date.setTime(local_time);
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "home";
    }
}
