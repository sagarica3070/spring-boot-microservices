//package com.example.springSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements UserDetailsService{
//
//	
//	@Autowired
//	UserRepo userRepo;
//	
//	public String createUser(String username, String password)
//	{
//		//User user= 
//		//User.Builder.password(password).username(username).authorities("student").build();
//				User user = new User.Builder()
//                .username(username)
//                .password(password)
//                .authorities("student")
//                .build();
//				
//				//userRepo.save(user);
//				
//				return "User Created Successfcully";
//				
//
//	}
//	
//	
//	
//	
//	
//	
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		return userRepo.findByUsername(username);
//	}
//	
//	
//
//
//}
