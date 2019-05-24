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

import com.backend.model.Feedbacks;
import com.backend.service.FeedbacksService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FeedbackController {

	@Autowired
	private FeedbacksService feedbackService;
	public List<Feedbacks> allFeedbacks;
	
	/*--send feedback --*/
	
	@PostMapping("/customer/feedbacks/send")
	public ResponseEntity<?> save(@RequestBody Feedbacks feedback){
		feedbackService.save(feedback);
		return ResponseEntity.ok().body("feedback id :"+feedback.getFeedback_id());
	}
	
	@GetMapping("/customer/feedbacks")
	public ResponseEntity<List<Feedbacks>> getAllFeedbacks(){
		allFeedbacks=feedbackService.list();
		return ResponseEntity.ok().body(allFeedbacks);
	}
}
