package com.claudio.emsthymeleaf.services.impl;

import java.util.List;
import java.util.Optional;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.repos.EmployeeRepo;
import com.claudio.emsthymeleaf.services.EmployeeService;
import com.claudio.emsthymeleaf.services.exceptions.ObjectNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo repo;

    public EmployeeServiceImpl(EmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public void insert(Employee obj) {
        repo.insert(obj);
    }

    @Override
    public void update(Employee obj) {
        repo.save(obj);
    }

    @Override
    public Employee findById(String id) {
        Optional<Employee> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Employee not found with ID: " + id));
    }

    @Override
    public void delete(String id) {
        Employee obj = findById(id);
        repo.delete(obj);
    }
}
