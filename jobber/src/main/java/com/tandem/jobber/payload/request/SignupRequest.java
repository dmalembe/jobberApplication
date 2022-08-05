package com.tandem.jobber.payload.request;

import java.util.Set;

import com.tandem.jobber.model.Role;

public class SignupRequest {

	private String username;
	
	private String email;
	
	private Set<Role> roles;
	
	private String password;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
