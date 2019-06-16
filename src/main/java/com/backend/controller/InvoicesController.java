package com.backend.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Invoices;
import com.backend.model.TimeSlotsRef;
import com.backend.model.Timeslots;
import com.backend.service.InvoicesService;
import com.backend.service.TimeslotsService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.NullPointerException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class InvoicesController {
	
	@Autowired
	private InvoicesService invoiceService;
	
	@Autowired
	private TimeslotsService timeSlotsService;
	
	
	@PostMapping("/customer/invoice/send")
	public Invoices save(@RequestBody Invoices invoice){
		invoiceService.save(invoice);
		System.out.print(invoice.toString());
		return invoice;	
	}
	
	@PostMapping("/customer/invoice/timeSlots/send")
	public ResponseEntity<?> saveTimeSlosts(@RequestBody String timeSlots) throws JsonParseException, JsonMappingException, IOException{
		
		Map<String, Object> response = new ObjectMapper().readValue(timeSlots, HashMap.class);
		long invoice_id=(int) (response.get("invoice_id"));
		String Date=(String) response.get("date");
		String subString=response.get("time_slot").toString().substring(1,response.get("time_slot").toString().length()-1);
		String[] slots=(subString.split(","));
		
		for(int i=0 ;i <slots.length;i++) {
			Timeslots timeSlot=new Timeslots();
			timeSlot.setInvoice_id(invoice_id);
			timeSlot.setTime_slot(slots[i]);
			timeSlot.setDate(Date);
			timeSlotsService.save(timeSlot);
		}
		
		return ResponseEntity.ok().body("sucessfully submited time slots !");
	}
	
	
	@GetMapping("/customer/invoice/selectedTimeSlots/{date}")
	public List<Integer> getNumOfTimeSLots(@PathVariable("date") String date){
		//System.out.println(date);
		List<Timeslots> allTimeSlots=timeSlotsService.getTimeSlots(date);
		List numOfTimeSlots = new ArrayList();
		Integer numOfFirstTimeSlots=0;
		Integer numOfSecondTimeSlots=0;
		Integer numOfThreedTimeSlots=0;
		Integer numOfForthTimeSlots=0;
		
		for(int i=0;i<allTimeSlots.size();i++) {
			if((allTimeSlots.get(i).getDate()).equals(date)) {
				
				if(allTimeSlots.get(i).getTime_slot().equals("8.00 AM - 9.00 AM")) {
					numOfFirstTimeSlots++;
				}
				if(allTimeSlots.get(i).getTime_slot().equals("10.00 AM - 11.00 AM")) {
					numOfSecondTimeSlots++;
				}
				if(allTimeSlots.get(i).getTime_slot().equals("12.00 PM - 2.00 PM")) {
					numOfThreedTimeSlots++;
				}
				if(allTimeSlots.get(i).getTime_slot().equals("3.00 PM - 4.00 PM")) {
					numOfForthTimeSlots++;
				}
			}
		}
		numOfTimeSlots.add(0, numOfFirstTimeSlots);
		numOfTimeSlots.add(1,numOfSecondTimeSlots);
		numOfTimeSlots.add(2,numOfThreedTimeSlots);
		numOfTimeSlots.add(3,numOfForthTimeSlots);
		
		return numOfTimeSlots;
	}
	
	@GetMapping("/customer/get/allInvoices/{customer_id}")
	public List<Invoices> getSelectedCustomerInvoice(@PathVariable("customer_id") long customer_id) throws NullPointerException{
		List<Invoices> allInvoices= invoiceService.getSelectedCustomerInvoice(customer_id);
		List invoices=new ArrayList();
		for(int i=0;i<allInvoices.size();i++) {
			if((allInvoices.get(i).getCustomer_id()).equals(customer_id)) {
				invoices.add(allInvoices.get(i));
			}
		}
		return invoices;
		
	}
	
	@GetMapping("/customer/get/invoice/{invoice_id}")
	public Invoices getInvoice(@PathVariable("invoice_id") long invoice_id) {
		Invoices invoice=invoiceService.get(invoice_id);
		return invoice;
	}

}
