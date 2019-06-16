package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Authentication")
public class Authentication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String user_name;
	private String email;
	private String password;
	private int is_loged;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	public int getIs_loged() {
		return is_loged;
	}
	public void setIs_loged(int is_loged) {
		this.is_loged = is_loged;
	}
	@Override
	public String toString() {
		return "Authentication [id=" + id + ", user_name=" + user_name + ", email=" + email + ", password=" + password
				+ ", is_loged=" + is_loged + "]";
	}
	
	
	
	
	
	
	
}
