package com.example.Controller;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

@GetMapping("/hello")
public String employeeHello(
Authentication authentication) {

return "Hello "
+ authentication.getName()
+ ", you are authenticated!";
}

@GetMapping("/details")
public String employeeDetails(
Authentication authentication) {

return "Employee API accessed by: "
+ authentication.getName();
}
}
