package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Invoices;
import com.backend.service.InvoicesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class InvoicesController {
	
	@Autowired
	private InvoicesService invoiceService;
	
	public ResponseEntity<?> save(Invoices invoice){
		return null;	
	}

}
