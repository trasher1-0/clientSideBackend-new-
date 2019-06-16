package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Authentication;
import com.backend.model.Rattings;
import com.backend.service.RattingsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RattingsController {
	
	@Autowired
	private RattingsService rattingService;
	private AuthenticationController authentication;
	private boolean is_rated_for_smallTrasher=false;
	private boolean is_rated_for_primumTrasher=false;
	private boolean is_rated_for_largeTrasher=false;
	
	@GetMapping("/customer/isRatedSmallTrasher/{customer_id}")
	public boolean isRatedForSmallTrasher(@PathVariable("customer_id") long customer_id) {
		List<Rattings> ratting=(List<Rattings>) rattingService.isRatedForSmallTrasher((long) customer_id);
		for(int i=0 ;i<ratting.size();i++) {
			if(ratting.get(i).getCustomer_id()==customer_id) {
				return true;
			}
		}
		return false;
		
		
	}
	
	@GetMapping("/customer/isRatedPrimumTrasher/{customer_id}")
	public boolean isRatedForPrimumTrasher(@PathVariable("customer_id") long customer_id) {
		List<Rattings> ratting=(List<Rattings>) rattingService.isRatedForPrimumTrasher((long) customer_id);
		for (int i=0;i<ratting.size();i++) {
			if(ratting.get(i).getCustomer_id()==customer_id) {
				return true;
			}
		}
		return false;
		
		
	}
	
	@GetMapping("/customer/isRatedLargeTrasher/{customer_id}")
	public boolean isRatedForLargeTrasher(@PathVariable("customer_id") long customer_id) {
		List<Rattings> ratting=(List<Rattings>) rattingService.isRatedForLargeTrasher((long) customer_id);
		for(int i=0;i<ratting.size();i++) {
			if(ratting.get(i).getCustomer_id()==customer_id) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
	@PostMapping("/customer/trasher/rattings/send")
	public Rattings save(@RequestBody Rattings ratting){
		try {
			rattingService.save(ratting);
			return ratting;
		}
		catch(Exception e) {
			return null;
		}
		
		
	}
	
	/*-- check whether purticular customer rated or not*/
	
	@GetMapping("/customer/isRated/smallTrasher")
	public ResponseEntity<List<Rattings>> isRatedForSmallTrasher(){
		List<Rattings> smallTrasher=rattingService.getSmallTrasherRattings();
		return ResponseEntity.ok().body(smallTrasher);
	}

	
	/*-- getting the ratting of small trasher --*/
	
	@GetMapping("/customer/smallTrasher/Rattings")
	public float getSmallTrasherRattings(){
		List<Rattings> smallTrasherRattings=rattingService.getSmallTrasherRattings();
		int Values=0;
		int counter1=0;
		try {
			for(int i=0;i< smallTrasherRattings.size();i++) {
				Values=(smallTrasherRattings.get(i).getRated_value() + Values);
				counter1++;
			}
			return (Values/counter1);	
		}
		catch(ArithmeticException e){
			return 0;
		}
		
	}
	
	/*-- getting the ratting of primum trasher*/
	
	@GetMapping("/customer/primumTrasher/Rattings")
	public float getPrimumTrasherRattings(){
		List<Rattings> primumTrasherRattings=rattingService.getPrimumTrasherRattings();
		int Values=0;
		int counter2=0;
		try {
			for(int i=0;i< primumTrasherRattings.size();i++) {
				Values=(primumTrasherRattings.get(i).getRated_value() + Values);
				counter2++;
			}
			return (Values/counter2);	
		} 
		catch(ArithmeticException e) {
			return 0;
		}
		
	}
	
	/* -- getting ratting of large trasher--*/
	
	@GetMapping("/customer/largeTrasher/Rattings")
	public float getlargeTrasherRattings(){
		List<Rattings> largeTrasherRattings=rattingService.getLargeTrasherRattings();
		int Values=0;
		int counter3=0;
		try {
			for(int i=0;i< largeTrasherRattings.size();i++) {
				Values=(largeTrasherRattings.get(i).getRated_value() + Values);
				counter3++;
			}
			return (Values/counter3);	
		}
		catch(ArithmeticException e) {
			return 0;
		}	
			
	}

	
}
