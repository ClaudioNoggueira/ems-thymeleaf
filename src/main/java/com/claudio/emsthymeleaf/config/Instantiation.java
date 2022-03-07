package com.claudio.emsthymeleaf.config;

import java.util.Arrays;

import com.claudio.emsthymeleaf.models.Employee;
import com.claudio.emsthymeleaf.repos.EmployeeRepo;

import org.springframework.boot.CommandLineRunner;

public class Instantiation implements CommandLineRunner {

    private EmployeeRepo repo;

    public Instantiation(EmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {

        repo.deleteAll();

        Employee maria = new Employee(null, "Maria", "Brown", "maria@gmail.com");
        Employee alex = new Employee(null, "Alex", "Green", "alex@gmail.com");
        Employee bob = new Employee(null, "Bob", "Grey", "bob@gmail.com");
        Employee john = new Employee(null, "John", "Cena", "johncena@email.com");
        Employee jack = new Employee(null, "Jack", "Bauer", "jackbauer@email.com");
        Employee chuck = new Employee(null, "Chuck", "Norris", "chucknorris@email");

        repo.saveAll(Arrays.asList(maria, alex, bob, john, jack, chuck));
    }
}
