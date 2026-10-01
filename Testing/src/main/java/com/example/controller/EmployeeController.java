package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

private final EmployeeService service;

public EmployeeController(EmployeeService service) {
this.service = service;
}

@PostMapping
public Employee addEmployee(@RequestBody Employee employee) {
return service.addEmployee(employee);
}

@GetMapping("/{id}")
public Employee getEmployee(@PathVariable Long id) {
return service.getEmployee(id);
}
}