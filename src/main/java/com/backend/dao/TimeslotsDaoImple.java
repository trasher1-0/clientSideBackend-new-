package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Timeslots;

@Repository
public class TimeslotsDaoImple implements TimeslotsDao{

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Timeslots timeslot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Timeslots get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Timeslots> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long invoice_id, Timeslots timeslot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
