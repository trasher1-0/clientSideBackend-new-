package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Notifications")
public class Notifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long notification_id;
	private Long customer_id;
	private int notification_type;
	private String notification;
	private String date_time;
	private int is_read;
	
	public Long getNotification_id() {
		return notification_id;
	}
	public void setNotification_id(Long notification_id) {
		this.notification_id = notification_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public int getNotification_type() {
		return notification_type;
	}
	public void setNotification_type(int notification_type) {
		this.notification_type = notification_type;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public int getIs_read() {
		return is_read;
	}
	public void setIs_read(int is_read) {
		this.is_read = is_read;
	}
	
	
	
	
	

}
