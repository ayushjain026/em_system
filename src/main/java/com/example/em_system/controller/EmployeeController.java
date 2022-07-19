package com.example.em_system.controller;

import com.example.em_system.model.Employee;
import com.example.em_system.services.EmployeeService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees/")
    public Employee createEmployee(@RequestBody  Employee employee){
        return employeeService.createEmployee(employee);
    }

}
