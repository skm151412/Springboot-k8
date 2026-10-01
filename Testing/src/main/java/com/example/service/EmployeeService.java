package com.example.service;


import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

private final EmployeeRepository repository;

public EmployeeService(EmployeeRepository repository) {
this.repository = repository;
}

public Employee addEmployee(Employee employee) {
return repository.save(employee);
}

public Employee getEmployee(Long id) {
return repository.findById(id).orElse(null);
}

public Employee findByName(String name) {
return repository.findByName(name);
}
}