package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public String getPayments() {
        return "Payment details";
    }

    @PostMapping
    public String makePayment() {
        return "Payment successful";
    }
}