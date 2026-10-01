package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/products")
    public String products() {
        return "Product data from Spring Boot";
    }

    @GetMapping("/orders")
    public String orders() {
        return "Order data from Spring Boot";
    }
}