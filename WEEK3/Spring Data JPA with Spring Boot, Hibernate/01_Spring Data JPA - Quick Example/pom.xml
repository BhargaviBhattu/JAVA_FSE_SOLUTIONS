package com.example.ems;

import com.example.ems.model.*;
import com.example.ems.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository empRepo, DepartmentRepository deptRepo) {
        return args -> {
            Department dept = new Department(null, "HR", null);
            deptRepo.save(dept);

            Employee emp1 = new Employee(null, "Alice", "alice@example.com", dept);
            Employee emp2 = new Employee(null, "Bob", "bob@example.com", dept);
            empRepo.saveAll(List.of(emp1, emp2));

            System.out.println("All Employees:");
            empRepo.findAll().forEach(System.out::println);

            System.out.println("Employees in HR Department:");
            empRepo.findByDepartmentName("HR").forEach(System.out::println);
        };
    }
}
