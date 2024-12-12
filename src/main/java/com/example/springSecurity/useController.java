package com.example.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/use")
public class useController {
	
	@GetMapping
	public String allowed()
	{
		return "Your allowed to see this";
	}

}
