package com.claudio.emsthymeleaf.controllers;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.services.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public String viewHomePage(Model model) {
        List<Employee> list = service.findAll();
        model.addAttribute("listAllEmployees", list);
        return "index";
    }

    @GetMapping(value = "/add-employee")
    public String viewAddEmployeeForm(Model model) {
        Employee obj = new Employee();
        model.addAttribute("employee", obj);
        return "add-employee";
    }

    @PostMapping(value = "/add-employee")
    public String addEmployee(@ModelAttribute("employee") Employee obj) {
        service.add(new Employee(null, obj.getFirstName(), obj.getLastName(), obj.getEmail()));
        return "redirect:/";
    }
}
