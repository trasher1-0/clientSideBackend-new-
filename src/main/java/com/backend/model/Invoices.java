package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Invoices")
public class Invoices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String invoice_type;
	private Long customer_id;
	private String customer_name;
	private String city;
	private String date;
	private int quantity;
	
	
	public Long getInvoice_id() {
		return id;
	}
	public void setInvoice_id(Long invoice_id) {
		this.id = id;
	}
	public String getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(String invoice_type) {
		this.invoice_type = invoice_type;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Invoices [id=" + id + ", invoice_type=" + invoice_type + ", customer_id=" + customer_id
				+ ", customer_name=" + customer_name + ", city=" + city + ", date=" + date + ", quantity=" + quantity
				+ "]";
	}
	
	


}
