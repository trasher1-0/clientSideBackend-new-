package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Help")
public class Help {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Help_id;
	private Long customer_id;
	private String help_type;
	private String help;
	public Long getHelp_id() {
		return Help_id;
	}
	public void setHelp_id(Long help_id) {
		Help_id = help_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getHelp_type() {
		return help_type;
	}
	public void setHelp_type(String help_type) {
		this.help_type = help_type;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	
	
}
