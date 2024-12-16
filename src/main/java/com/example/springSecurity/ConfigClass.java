package com.example.springSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterChain;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity

@EnableMethodSecurity
public class ConfigClass {
	
//	@Bean
//public UserDetailsService userDetailsService(){
//	UserDetails admin= User.withUsername("Saga").password("Saga").roles("Admin").build();
//	
//	UserDetails user=User.withUsername("Pallavi").password("Pallavi").roles("User").build();
//	
//	
//	
////	org.springframework.security.core.userdetails.Use
//	
//	return new InMemoryUserDetailsManager(user,admin);
//	
//}
//	
//	
//	
//	
//	protected void configure(HttpSecurity http)
//	{
//		return http.csrf().disable()
//	    .authorizeHttpRequests(authz -> authz
//	            .requestMatchers("/home/url1").permitAll()
//	            .requestMatchers("/home/**").authenticated()
//	        )
//	        .formLogin();
//
//	}
	
	
//
//	@Bean
//	@Order(SecurityProperties.BASIC_AUTH_ORDER)
//	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//		http.formLogin(withDefaults());
//		http.httpBasic(withDefaults());
//		return http.build();
//	}
	
//	  @Bean
//	    public UserDetailsService userDetailsService() {
//
//	        // Create UserDetails objects
//	        UserDetails user1 = User.withUsername("user1")
//	                                .password("{noop}pass1") // No-op encoder for plain text passwords
//	                                .roles("USER")
//	                                .build();
//
//	        UserDetails admin = User.withUsername("admin")
//	                                .password("{noop}pass2")
//	                                .roles("ADMIN")
//	                                .build();
//
//	        // Return an InMemoryUserDetailsManager with the users
//	        return new InMemoryUserDetailsManager(user1, admin);
//	    }
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		
//		UserDetails user1=User.withUsername("user1").password("{noop}pass1").roles("user").build();
//		UserDetails admin=User.withUsername("admin").password("{noop}pass2").roles("admin").build();
//
//		
//		return new InMemoryUserDetailsManager(user1,admin);
//	}

//	
//	 @Autowired
//	    private UserService userService;
//	    @Bean
//	    public AuthenticationProvider authenticationProvider(){
//	        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//	        provider.setUserDetailsService(userService);
//	        provider.setPasswordEncoder(passwordEncoder());
//	        return provider;
//	    }
//	    @Bean
//	    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//	        httpSecurity
//	                .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
//	                .httpBasic(Customizer.withDefaults()).formLogin(Customizer.withDefaults());
////            .authorizeHttpRequests(
////                    authorizeRequest -> authorizeRequest
////                            .requestMatchers("/test/student").hasAuthority("student")
////                            .requestMatchers("/test/admin").hasAuthority("admin")
////                            .anyRequest().permitAll()
////            )
//	        return httpSecurity.build();
//	    }
//

	    @Bean
	    public PasswordEncoder passwordEncoder(){
	        return new BCryptPasswordEncoder();
	    }
	
}
