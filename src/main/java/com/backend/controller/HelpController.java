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

import com.backend.model.Help;
import com.backend.service.HelpService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class HelpController {
	
	@Autowired
	private HelpService helpService;
	
	@PostMapping("/customer/help/send")
	public ResponseEntity<?> save(@RequestBody Help help){
		helpService.save(help);
		return ResponseEntity.ok().body("help id : "+help.getHelp_id());
		
	}
	
	
	@GetMapping("/customer/help")
	public ResponseEntity<List<Help>> getAllHelpRequests(){
		List<Help> allHelpRequests=helpService.list();
		return ResponseEntity.ok().body(allHelpRequests);
		
	}

}
