package com.user.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "email") 
		})
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private long primaryMobile;
	private long secondaryMobile;
	private String secondaryEmail; 
	private Date addDate;
	private Date registeredAt ;
	private Date lastLogin ; 							
	private byte failureCount;
	private Date lastPwdChngDt;
	private String status;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User( String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User(String email, String password,long primaryMobile, String status) {
		this.primaryMobile = primaryMobile;
		this.status = status;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getPrimaryMobile() {
		return primaryMobile;
	}

	public void setPrimaryMobile(long primaryMobile) {
		this.primaryMobile = primaryMobile;
	}

	public long getSecondaryMobile() {
		return secondaryMobile;
	}

	public void setSecondaryMobile(long secondaryMobile) {
		this.secondaryMobile = secondaryMobile;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public byte getFailureCount() {
		return failureCount;
	}

	public void setFailureCount(byte failureCount) {
		this.failureCount = failureCount;
	}

	public Date getLastPwdChngDt() {
		return lastPwdChngDt;
	}

	public void setLastPwdChngDt(Date lastPwdChngDt) {
		this.lastPwdChngDt = lastPwdChngDt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	


}
