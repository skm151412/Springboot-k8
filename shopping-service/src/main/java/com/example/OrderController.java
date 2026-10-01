package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {

    @GetMapping("/orders")
    public String orders() {
        return "User orders";
    }

    @GetMapping("/payments")
    public String payments() {
        return "User payment information";
    }
}