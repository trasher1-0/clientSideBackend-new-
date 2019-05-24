package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Notifications;

@Repository
public class NotificationsDaoImple implements NotificationsDao{

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Notifications notification) {
		sessionFactory.getCurrentSession().save(notification);
		return notification.getNotification_id();
	}

	@Override
	public Notifications get(long notification_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notifications> list() {
		List<Notifications> notifications=sessionFactory.getCurrentSession().createQuery("from Notifications").list();
		return notifications;
	}

	@Override
	public void update(long notification_id, Notifications notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long notification_id) {
		// TODO Auto-generated method stub
		
	}

}
