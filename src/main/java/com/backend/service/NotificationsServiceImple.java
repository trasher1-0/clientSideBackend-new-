package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.NotificationsDao;
import com.backend.model.Notifications;

@Service
@Transactional(readOnly = true)
public class NotificationsServiceImple implements NotificationsService{

	@Autowired
	private NotificationsDao notificationDao;
	
	@Transactional
	@Override
	public long save(Notifications notification) {
		return notificationDao.save(notification);
	}

	@Override
	public Notifications get(long notification_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notifications> list() {
		return notificationDao.list();
	}

	@Transactional
	@Override
	public void update(long notification_id, Notifications notification) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long notification_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notifications> unReadNotificationlist() {
		return notificationDao.unReadNotificationlist();
	}

}
