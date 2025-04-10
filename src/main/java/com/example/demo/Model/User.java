package com.example.demo.Model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.lang.*;
@Entity
@Component


	
public class User {
	public User() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginid;
	@Column(unique=true , nullable=false)
	private String username;
	private String password;
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
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
	public User(int loginid, String username, String password) {
		super();
		this.loginid = loginid;
		this.username = username;
		this.password = password;
	}
	
	
	
	
}
