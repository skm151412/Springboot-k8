package com.example.repository;

import com.example.entity.Employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EmployeeRepositoryTest {

@Autowired
private EmployeeRepository repository;

@Test
void testSaveAndFindEmployee() {

Employee employee =
new Employee("Anil", "IT");

Employee saved =
repository.save(employee);

assertThat(saved.getId())
.isNotNull();

Employee result =
repository.findByName("Anil");

assertThat(result)
.isNotNull();

assertThat(result.getName())
.isEqualTo("Anil");

assertThat(result.getDepartment())
.isEqualTo("IT1");
}
}
