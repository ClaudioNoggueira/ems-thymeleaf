package com.claudio.emsthymeleaf.services;

import java.util.List;

import com.claudio.emsthymeleaf.models.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    List<Employee> findByEmail(String email);

    Employee findById(String id);

    void insert(Employee obj);

    void update(Employee obj);

    void delete(String id);
}
