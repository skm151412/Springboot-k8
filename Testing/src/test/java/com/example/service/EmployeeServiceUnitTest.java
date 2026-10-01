package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceUnitTest {

@Mock
private EmployeeRepository repository;

@InjectMocks
private EmployeeService service;

@Test
void testAddEmployee() {

Employee employee =
new Employee("Raghu", "CSE");

when(repository.save(employee))
.thenReturn(employee);

Employee result =
service.addEmployee(employee);

assertThat(result).isNotNull();
assertThat(result.getName())
.isEqualTo("Raghu");
assertThat(result.getDepartment())
.isEqualTo("CSE");

verify(repository, times(1))
.save(employee);
}
}