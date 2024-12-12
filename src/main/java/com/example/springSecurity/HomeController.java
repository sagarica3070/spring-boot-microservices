package com.example.springSecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/url1")
	public String greet()
	{
		return "this is me";
	}
	
	
	@GetMapping("/url2")
	public String onlyForAdmin()
	{
		return "this is for admin";
	}
	
	@GetMapping("/url3")
	public String onlyForUser()
	{
		return "this is for user";
	}

	
	@PreAuthorize("hasRole('user')")
	@GetMapping("/user")
	public String userEndpoint()
	{
		return "Hello User!!";
	}
	
	
	@GetMapping("/admin")
	public String adminEndpoint()
	{
		return "Hello Admin!!";
	}

}
