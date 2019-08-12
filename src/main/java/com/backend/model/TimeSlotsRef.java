package com.backend.model;

import java.util.List;

public class TimeSlotsRef {
	
	public long invoice_id;
	public List<String> timeSlots;
	
	@Override
	public String toString() {
		return "TimeSlotsRef [invoice_id=" + invoice_id + ", timeSlots=" + timeSlots + "]";
	}
	
	

}
