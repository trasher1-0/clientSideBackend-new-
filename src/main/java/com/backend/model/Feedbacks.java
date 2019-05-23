package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Feedbacks")
public class Feedbacks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedback_id;
	private Long customer_id;  
	private String feedback ;
	public Long getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(Long feedback_id) {
		this.feedback_id = feedback_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	
}
