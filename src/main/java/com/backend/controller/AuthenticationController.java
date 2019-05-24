package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Authentication;
import com.backend.service.AuthenticationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService authenticationService;
	private Authentication allCustomers[];
	
	/*---Signup the customer---*/
	@PostMapping("/signUp/Authentication")
	public ResponseEntity<?> save(@RequestBody Authentication authentication){
		
		return null;
	}
	
	
	@PostMapping("/login/Authentication")
	public ResponseEntity<?> Login(@RequestBody Authentication authentication){
		return null;
		
	}
	

}
