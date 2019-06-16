package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.TimeslotsDao;
import com.backend.model.Timeslots;

@Service
@Transactional(readOnly = true)
public class TimeslotsServiceImple implements TimeslotsService {
	
	@Autowired
	private TimeslotsDao timeslotsDao;

	@Transactional
	@Override
	public long save(Timeslots timeslot) {
		return timeslotsDao.save(timeslot);
	}

	@Override
	public Timeslots get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Timeslots> getTimeSlots(String date) {
		//System.out.println(date);
		return timeslotsDao.getTimeSlots(date);
	}

	@Override
	public List<Timeslots> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void update(long invoice_id, Timeslots timeslot) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}



}
