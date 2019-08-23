package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Booking;
import com.backend.model.Payment;
import com.backend.service.PaymentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/customer/payment/save")
	   public ResponseEntity<?> save(@RequestBody Payment payment) {
	      long id = paymentService.save(payment);
	      System.out.println(id);
	      return ResponseEntity.ok().body("New Booking has been saved with ID:" + id);
	   }
	
	
	@GetMapping("http://18.136.123.249:8080/backend/api/customer/payment/notify")
	 public ResponseEntity<Payment> get() {
	      
	      return null;
	   }

}
