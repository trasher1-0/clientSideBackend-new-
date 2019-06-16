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

import com.backend.model.Authentication;
import com.backend.model.Customer;
import com.backend.service.AuthenticationService;
import com.backend.service.CustomerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private CustomerService customerService;
	private List<Authentication> allCustomers;
	private Long customer_id;
	
	/*---Signup the customer---*/
	@PostMapping("/signUp/Authentication")
	public Authentication save(@RequestBody Authentication authentication){
		allCustomers=authenticationService.list();
		for(int i=0 ;i< allCustomers.size();i++) {
			if(allCustomers.get(i).getEmail().equalsIgnoreCase(authentication.getEmail())) {
				return (authentication);
			}
			if(allCustomers.get(i).getUser_name().equalsIgnoreCase(authentication.getUser_name())) {
				return (authentication);
			}
		}
		customer_id=authenticationService.save(authentication);
		Customer customer=new Customer();
		customer.setId(customer_id);
		customer.setUser_name(authentication.getUser_name());
		customerService.save(customer);
		return (authentication);
	}
	
	
	/*-- Log the Customer --*/
	
	@PostMapping("/login/Authentication")
	public Authentication Login(@RequestBody Authentication authentication){
		allCustomers=authenticationService.list();
		for(int i=0 ;i< allCustomers.size();i++) {
			System.out.println(allCustomers.get(i).getUser_name());
			System.out.println(authentication.getUser_name());
			if(allCustomers.get(i).getUser_name().equalsIgnoreCase(authentication.getUser_name())) {
				System.out.println("entered");
				if(allCustomers.get(i).getPassword().equals(authentication.getPassword())) {
					System.out.println("entered");
					System.out.println(allCustomers.get(i));
				//	customer_id=allCustomers.get(i).getId();
					return (allCustomers.get(i));
				}
			}
		}
		return (authentication);
		
	}


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	
	
	

}
