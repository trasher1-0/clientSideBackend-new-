package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Notifications;

public interface NotificationsDao {

	long save(Notifications notification);

	Notifications get(long notification_id);

	   List<Notifications> list();

	   void update(long notification_id, Notifications notification);

	   void delete(long notification_id);

}
