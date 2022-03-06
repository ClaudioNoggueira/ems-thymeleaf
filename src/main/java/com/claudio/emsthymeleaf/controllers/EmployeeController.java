package com.claudio.emsthymeleaf.controllers;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.services.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public String viewHomePage(Model model) {
        List<Employee> list = service.findAllEmployees();
        model.addAttribute("listAllEmployees", list);
        return "index";
    }

}
