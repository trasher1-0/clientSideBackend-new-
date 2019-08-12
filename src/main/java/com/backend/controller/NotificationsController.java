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

import com.backend.model.Notifications;
import com.backend.service.NotificationsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class NotificationsController {

	@Autowired
	private NotificationsService notificationService;
	private List<Notifications> allUnreadNotifications;
	private List<Notifications> allNotifications;
	
	
	/*-- get all the notifications -- */
	@GetMapping("/customer/allNotifications")
	public ResponseEntity<List<Notifications>> getAllTheNotications(){
		List<Notifications> allNotifications=notificationService.list();
		return ResponseEntity.ok().body(allNotifications);
	}
	
	
	/*-- get all unread notifications--*/
 
	@GetMapping("/customer/notifications/unread")
	public ResponseEntity<List<Notifications>> getAllTheUnreadNotifications(){
		List<Notifications> allUnreadNotifications=notificationService.unReadNotificationlist();
		return ResponseEntity.ok().body(allUnreadNotifications);
	}
	
}
