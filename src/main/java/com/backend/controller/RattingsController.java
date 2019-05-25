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
	private boolean is_rated_for_primumTrasher;
	private boolean is_rated_for_largeTrasher;
	
	@PostMapping("customer/trasher/rattings/send")
	public ResponseEntity<?> save(@RequestBody Rattings ratting){
		rattingService.save(ratting);
		return ResponseEntity.ok().body("ratted Id : " + ratting.getRatting_id());
		
	}
	
	/*-- check whether purticular customer rated or not*/
	
	
	
	//@GetMapping("/dashboad")
	public ResponseEntity<List<Rattings>> is_Rated(Long customer_id) {
		List<Rattings> rattings=rattingService.checkRatted((long) 1);
		for(int i=0;i<rattings.size();i++) {
			if(rattings.get(i).getTrasher_type()==1) {
				setIs_rated_for_smallTrasher(true);
			}
			if(rattings.get(i).getTrasher_type()==2) {
				setIs_rated_for_primumTrasher(true);
			}
			if(rattings.get(i).getTrasher_type()==3) {
				setIs_rated_for_largeTrasher(true);
			}
		}
		return ResponseEntity.ok().body(rattings);
	}
	
	@GetMapping("/dashboad/smallTrasher")
	public boolean isIs_rated_for_smallTrasher() {
		return is_rated_for_smallTrasher;
	}

	
	public void setIs_rated_for_smallTrasher(boolean is_rated_for_smallTrasher) {
		this.is_rated_for_smallTrasher = is_rated_for_smallTrasher;
	}

	@GetMapping("/dashboad/primumTrasher")
	public boolean isIs_rated_for_primumTrasher() {
		return is_rated_for_primumTrasher;
	}

	public void setIs_rated_for_primumTrasher(boolean is_rated_for_primumTrasher) {
		this.is_rated_for_primumTrasher = is_rated_for_primumTrasher;
	}

	@GetMapping("/dashboad/largeTrasher")
	public boolean isIs_rated_for_largeTrasher() {
		return is_rated_for_largeTrasher;
	}

	public void setIs_rated_for_largeTrasher(boolean is_rated_for_largeTrasher) {
		this.is_rated_for_largeTrasher = is_rated_for_largeTrasher;
	}

	
	/*-- getting the ratting of small trasher --*/
	
	//@GetMapping("customer/smallTrasher/Rattings")
	public float getSmallTrasherRattings(){
		List<Rattings> smallTrasherRattings=rattingService.getSmallTrasherRattings();
		int Values=0;
		int counter1=0;
		for(int i=0;i< smallTrasherRattings.size();i++) {
			Values=(smallTrasherRattings.get(i).getRated_value() + Values);
			counter1++;
		}
		return (Values/counter1);	
	}
	
	/*-- getting the ratting of primum trasher*/
	
	//@GetMapping("customer/primumTrasher/Rattings")
	public float getPrimumTrasherRattings(){
		List<Rattings> primumTrasherRattings=rattingService.getPrimumTrasherRattings();
		int Values=0;
		int counter2=0;
		for(int i=0;i< primumTrasherRattings.size();i++) {
			Values=(primumTrasherRattings.get(i).getRated_value() + Values);
			counter2++;
		}
		return (Values/counter2);	
	}
	
	/* -- getting ratting of large trasher--*/
	
	//@GetMapping("customer/largeTrasher/Rattings")
	public float getlargeTrasherRattings(){
		List<Rattings> largeTrasherRattings=rattingService.getLargeTrasherRattings();
		int Values=0;
		int counter3=0;
		for(int i=0;i< largeTrasherRattings.size();i++) {
			Values=(largeTrasherRattings.get(i).getRated_value() + Values);
			counter3++;
		}
		return (Values/counter3);	
	}

	
}
