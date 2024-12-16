package com.example.springSecurity;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements UserDetails{
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    // Username of the user
	    private String username;

	    // Password of the user
	    private String password;

	    // Authorities granted to the user, stored as a single string
	    private String authorities;

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			
			         return Arrays.stream(this.authorities.split("::"))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
		}

		@Override
		public String getPassword() {
			
			return password;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return username;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setAuthorities(String authorities) {
			this.authorities = authorities;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", authorities="
					+ authorities + "]";
		}

		public User(int id, String username, String password, String authorities) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.authorities = authorities;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	    
		 // Builder for User class
	    public static class Builder {
	        private int id;
	        private String username;
	        private String password;
	        private String authorities;

	        public Builder id(int id) {
	            this.id = id;
	            return this;
	        }

	        public Builder username(String username) {
	            this.username = username;
	            return this;
	        }

	        public Builder password(String password) {
	            this.password = password;
	            return this;
	        }

	        public Builder authorities(String authorities) {
	            this.authorities = authorities;
	            return this;
	        }

	        public User build() {
	            return new User(id, username, password, authorities);
	        }
	    }

	    


}
