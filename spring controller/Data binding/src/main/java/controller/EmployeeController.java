package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createEmployee(Model model){
        model.addAttribute("create",new Employee());
        return"create";
    }
    @RequestMapping(value = "info",method = RequestMethod.POST)
    public String infoEmployee(@ModelAttribute("employee")Employee employee, BindingResult result,Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("id",employee.getId());
        model.addAttribute("contactNumber",employee.getContactNumber());
        return "info";
    }
}
