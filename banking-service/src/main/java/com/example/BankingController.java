package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BankingController {

    @GetMapping("/accounts")
    public String accounts() {
        return "Account details";
    }

    @GetMapping("/transactions")
    public String transactions() {
        return "Transaction details";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin banking information";
    }
}