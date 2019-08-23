package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Long invoice_id;
	private String is_verified;
	private String amount;
	private String is_success;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Long invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getIs_verified() {
		return is_verified;
	}
	public void setIs_verified(String is_verified) {
		this.is_verified = is_verified;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getIs_success() {
		return is_success;
	}
	public void setIs_success(String is_success) {
		this.is_success = is_success;
	}
	
	@Override
	public String toString() {
		return "payment [id=" + id + ", invoice_id=" + invoice_id + ", is_verified=" + is_verified + ", amount="
				+ amount + ", is_success=" + is_success + ", getId()=" + getId() + ", getInvoice_id()="
				+ getInvoice_id() + ", getIs_verified()=" + getIs_verified() + ", getAmount()=" + getAmount()
				+ ", getIs_success()=" + getIs_success() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
	