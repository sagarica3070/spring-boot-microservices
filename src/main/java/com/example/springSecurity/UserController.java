//package com.example.springSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/test")
//public class UserController {
//	
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/student")
//	public String greet()
//	{
//		return "this is me";
//	}
//    
//    @GetMapping("/admin")
//	public String onlyForAdmin()
//	{
//		return "this is for admin";
//	}
//	@GetMapping("/url1")
//	public String greetme()
//	{
//		return "this is me";
//	}
//    
////    
////    @PostMapping("/save/{username}/{password}")
////    String createNewUser(@RequestParam String username,@RequestParam String password )
////    {
////    	return userService.createUser(username, password);
////    			
////    }
//	
//	 @PostMapping("/create")
//	    public String create(@RequestParam("username") String username, @RequestParam("password") String password){
//	       return  userService.createUser(username, password);
//	    }
//    
//    
//    
//    
//    
//}
