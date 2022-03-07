package com.claudio.emsthymeleaf.services;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    void insert(Employee obj);

    void update(Employee obj);

    Employee findById(String id);
}
