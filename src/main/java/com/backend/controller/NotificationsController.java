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
	
	
	public void getNotifications(){
		List<Notifications> allNotifications=notificationService.list();
		if(allNotifications.size() != 0) {
			for(int i=0;i<allNotifications.size();i++) {
				if(allNotifications.get(i).getIs_read()==0) {
					allUnreadNotifications.add(allNotifications.get(i));
				}
			}
		}
	}
	
	/*-- get all the notifications -- */
	@GetMapping("/customer/allNotifications")
	public ResponseEntity<List<Notifications>> getAllTheNotications(){
		getNotifications();
		return ResponseEntity.ok().body(allNotifications);
	}
	
	
	/*-- get all unread notifications--*/
	@GetMapping("/customer/notifications/unread")
	
	public ResponseEntity<List<Notifications>> getAllTheUnreadNotifications(){
		getNotifications();
		return ResponseEntity.ok().body(allUnreadNotifications);
	}
	
}
