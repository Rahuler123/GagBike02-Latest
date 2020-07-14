package com.user.dto;

import java.util.Set;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class SignupRequestDto {
	
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
  

	private long primaryMobile;
	
	private String status;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPrimaryMobile() {
		return primaryMobile;
	}

	public void setPrimaryMobile(long primaryMobile) {
		this.primaryMobile = primaryMobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
