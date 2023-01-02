package com.ecafe.entity;


import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.Role;


@Entity
public class AppUser {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int UserId;
	private String username;
	private String password;
	@Enumerated
	private Role role;
	private long mobilenumber;
	public AppUser(int userId, String username, String password, Role role, long mobilenumber) {
		super();
		UserId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.mobilenumber = mobilenumber;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(String username, String password, Role role, long mobilenumber) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.mobilenumber = mobilenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "AppUser [UserId=" + UserId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", mobilenumber=" + mobilenumber + "]";
	}

}

