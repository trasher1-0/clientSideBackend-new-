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

import com.backend.model.Comments;
import com.backend.service.CommentsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CommentsController {

	@Autowired
	private CommentsService commentService;
	
	/*-- send the comment for purticular trasher --*/
	
	@PostMapping("/trasher/comments")
	public ResponseEntity<?> save(@RequestBody Comments comment){
		commentService.save(comment);
		return ResponseEntity.ok().body("comment id : "+comment.getComment_id());
		
	}
	
	/*-- getting all the comments of trasher -- */
	public ResponseEntity<List<Comments>> getAllCommets(){
		List<Comments> allComments=commentService.list();
		return ResponseEntity.ok().body(allComments);
		
	}
	
	
}
