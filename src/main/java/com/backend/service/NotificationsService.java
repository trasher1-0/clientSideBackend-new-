package com.backend.service;

import java.util.List;

import com.backend.model.Notifications;

public interface NotificationsService {

	long save(Notifications notification);

	Notifications get(long notification_id);

	   List<Notifications> list();

	   void update(long notification_id, Notifications notification);

	   void delete(long notification_id);

	List<Notifications> unReadNotificationlist();

}
