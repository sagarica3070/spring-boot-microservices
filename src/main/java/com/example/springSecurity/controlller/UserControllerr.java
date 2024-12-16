package com.example.springSecurity.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.springSecurity.UserRepo;
import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repo.UserRepo;


@RestController

public class UserControllerr {
	
	
	@Autowired
 UserRepo userRepo;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody Users user)
	{
		userRepo.save(user);
		
		return "User Registered Successfully!!";
	}

}
