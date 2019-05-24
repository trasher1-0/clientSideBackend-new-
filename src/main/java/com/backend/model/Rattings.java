package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Rattings")
public class Rattings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long customer_id;
	private int trasher_type;
	private int rated_value;
	
	public Long getRatting_id() {
		return id;
	}
	public void setRatting_id(Long ratting_id) {
		this.id = id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public int getTrasher_type() {
		return trasher_type;
	}
	public void setTrasher_type(int trasher_type) {
		this.trasher_type = trasher_type;
	}
	public int getRated_value() {
		return rated_value;
	}
	public void setRated_value(int rated_value) {
		this.rated_value = rated_value;
	}
	
	
	
}
