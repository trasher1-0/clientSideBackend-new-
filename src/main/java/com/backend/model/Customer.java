package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Customer")
public class Customer {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String user_name;
	private String address;
	private String city;
	private String tel;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getProf_pic() {
		return prof_pic;
	}
	public void setProf_pic(String prof_pic) {
		this.prof_pic = prof_pic;
	}
	private String prof_pic;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + ", city=" + city + ", tel=" + tel + "]";
	}
	
	
	
	
}
