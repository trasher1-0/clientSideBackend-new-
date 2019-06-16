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
	
	
	@PostMapping("/customer/trasher/comments/send")
	public ResponseEntity<?> save(@RequestBody Comments comment){
		commentService.save(comment);
		return ResponseEntity.ok().body("comment id : "+comment.getComment_id());
		
	}
	
	/*-- getting all the comments of particular trasher -- */
	
	@GetMapping("/dashboad/comments/smallTrasher")
	public ResponseEntity<List<Comments>> getAllCommentsForSmallTrasher(){
		List<Comments> smallTrasherComments=commentService.getSmallTrasherComments();
		return ResponseEntity.ok().body(smallTrasherComments);
	}
	
	@GetMapping("/dashboad/comments/primumTrasher")
	public ResponseEntity<List<Comments>> getAllCommentsForPrimumTrasher(){
		List<Comments> primumTrasherComments=commentService.getPrimumTrasherComments();
		return ResponseEntity.ok().body(primumTrasherComments);
	}
	
	
	@GetMapping("/dashboad/comments/largeTrasher")
	public ResponseEntity<List<Comments>> getAllCommentsForLargeTrasher(){
		List<Comments> largeTrasherComments=commentService.getLargeTrasherComments();
		return ResponseEntity.ok().body(largeTrasherComments);
	}
	
}
