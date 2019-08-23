package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.CustomerService;
import com.backend.model.Booking;
import com.backend.model.Customer;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
/*	
	@PostMapping("/customer/save")
	public ResponseEntity<?> save(@RequestBody Customer customer){
		customerService.save(customer);
		return ResponseEntity.ok().body("New Booking has been saved with ID:");
		
	}
	*/
	
	@GetMapping("/customers")
   public ResponseEntity<List<Customer>> list() {
      List<Customer> customer = customerService.list();
	     return ResponseEntity.ok().body(customer);
   }
}
