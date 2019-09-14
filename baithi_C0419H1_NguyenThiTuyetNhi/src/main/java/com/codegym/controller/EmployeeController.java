package com.codegym.controller;

import com.codegym.model.Employees;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;
@Controller
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

//        @ModelAttribute("groups")
//        public Iterable<Group> groups() {
//            return groupService.findAll();
//        }
        @GetMapping(value = "/employees",produces = "application/json;charset=UTF-8")
        public ModelAndView listEmployees(@RequestParam("s") Optional<String> s, Pageable pageable){
            Page<Employees> employees;
            if (s.isPresent()){
                employees = employeeService.findAllByNameContaining(s.get(),pageable);
            }else {
                employees = employeeService.findAll(pageable);
            }
            ModelAndView modelAndView = new ModelAndView("/home/index");
            modelAndView.addObject("employees", employees);
            return modelAndView;
        }
        @GetMapping(value = "/create-employee",produces = "application/json;charset=UTF-8")
        public ModelAndView showCreateEmployee(){
            ModelAndView modelAndView = new ModelAndView("/employee/create");
            modelAndView.addObject("employee",new Employees());
            return modelAndView;

        }
        @PostMapping(value = "/create-employee",produces = "application/json;charset=UTF-8")
        public ModelAndView saveEmployee(@Valid @ModelAttribute("employee") Employees employees, BindingResult bindingResult){
            try {
                if (bindingResult.hasFieldErrors()){
                    ModelAndView modelAndView = new ModelAndView("employee/create");
                    return modelAndView;
                }
                employeeService.save(employees);
                ModelAndView modelAndView = new ModelAndView("/employee/create");
                modelAndView.addObject("employees",new Employees());
                modelAndView.addObject("message","New employee created successfully");
                return modelAndView;

            }catch (Exception ex){
                ModelAndView modelAndView = new ModelAndView("/employee/create");
                modelAndView.addObject ( "message1","already exist" );
                return modelAndView;

            }
        }
        @GetMapping(value = "/edit-employee/{id}",produces = "application/json;charset=UTF-8")
        public ModelAndView showEditEmployee(@PathVariable Long id){
            Employees employees = employeeService.findById(id);
            if (employees != null){
                ModelAndView modelAndView = new ModelAndView("/employee/edit");
                modelAndView.addObject("employee",employees);
                return modelAndView;
            }
            ModelAndView modelAndView = new ModelAndView("/eror404");
            return modelAndView;


        }
        @PostMapping(value = "/edit-employee",produces = "application/json;charset=UTF-8")
        public ModelAndView updateEmployee(@Valid @ModelAttribute("employee")Employees employees,BindingResult bindingResult){
               try {
                   if (bindingResult.hasFieldErrors()){
                       ModelAndView modelAndView = new ModelAndView("employee/edit");
                       return modelAndView;
                   }
                   employeeService.save(employees);
                   ModelAndView modelAndView = new ModelAndView("/employee/edit");
                   modelAndView.addObject("employee",employees);
                   modelAndView.addObject("message","employee update");
                   return modelAndView;
               }catch (Exception ex){
                   ModelAndView modelAndView = new ModelAndView("/employee/edit");
                   modelAndView.addObject ( "message1","already exist" );
                   return modelAndView;
               }


        }
//        @GetMapping(value = "/delete-employee/{id}",produces = "application/json;charset=UTF-8")
//        public ModelAndView showDeleteEmployee(@PathVariable Long id){
//            Employees employees = employeeService.findById(id);
//            if (employees != null){
//                ModelAndView modelAndView = new ModelAndView("/employee/delete");
//                modelAndView.addObject("employee",employees);
//                return modelAndView;
//            }
//            ModelAndView modelAndView = new ModelAndView("eror404");
//            return modelAndView;
//
//        }
//        @PostMapping(value = "/delete-employee",produces = "application/json;charset=UTF-8")
//        public String moveEmployee(@ModelAttribute("employee")Employees employees){
//            employeeService.remove(employees.getId());
//            return "redirect:employees";
//        }

    @GetMapping("/delete-employee/{id}")
    public String showDeleteForm(@PathVariable Long id) {
        Employees employees = employeeService.findById(id);
        if (employees != null) {
            employeeService.remove(employees.getId());
            return "redirect:/employees";
        }
        return "/error.404";
    }

    }


