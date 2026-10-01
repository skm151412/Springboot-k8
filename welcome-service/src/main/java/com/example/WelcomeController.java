package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "<h1 style='color:blue;'>WELCOME <span style='color:red;'>TO</span> <span style='color:green;'>KLH</span> <span style='color:orange;'>CAMPUS</span></h1>";
    }
}