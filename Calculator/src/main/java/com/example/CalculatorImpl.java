package com.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.Calculator")
public class CalculatorImpl implements Calculator {

    @Override
    public double averageSalary(Employee[] employees) {

        if (employees == null || employees.length == 0)
            return 0;

        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum / employees.length;
    }
}