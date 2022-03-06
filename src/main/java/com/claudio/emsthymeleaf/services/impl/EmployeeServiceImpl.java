package com.claudio.emsthymeleaf.services.impl;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.repos.EmployeeRepo;
import com.claudio.emsthymeleaf.services.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo repo;

    public EmployeeServiceImpl(EmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return repo.findAll();
    }
}
