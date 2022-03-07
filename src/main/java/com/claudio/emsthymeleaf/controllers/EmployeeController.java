package com.claudio.emsthymeleaf.controllers;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.services.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        service.insert(obj);
        return "redirect:/";
    }

    @GetMapping(value = "/edit-employee/{id}")
    public String viewEditForm(@PathVariable(value = "id") String id, Model model) {
        Employee obj = service.findById(id);
        model.addAttribute("employee", obj);
        return "edit-employee";
    }

    @PostMapping(value = "/edit-employee")
    public String editEmployee(@ModelAttribute("employee") Employee obj) {
        service.update(obj);
        return "redirect:/";
    }
}
