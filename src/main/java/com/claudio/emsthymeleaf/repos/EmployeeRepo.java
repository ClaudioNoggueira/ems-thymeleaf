package com.claudio.emsthymeleaf.repos;

import com.claudio.emsthymeleaf.models.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {

}