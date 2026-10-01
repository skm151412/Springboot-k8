package com.example.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

@GetMapping("/hello")
public String adminHello() {

	return "Welcome Admin! "
			+ "You have ADMIN authorization.";
	}

}