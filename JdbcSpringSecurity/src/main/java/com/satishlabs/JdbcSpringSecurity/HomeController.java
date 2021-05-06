package com.satishlabs.JdbcSpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welome to Home</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welome to User</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welome to Admin</h1>");
	}
	
}

