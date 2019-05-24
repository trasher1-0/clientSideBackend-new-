package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Rattings;

@Repository
public class RattingsDaoImple implements RattingsDao{

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Rattings ratting) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rattings get(long ratting_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rattings> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long ratting_id, Rattings ratting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long ratting_id) {
		// TODO Auto-generated method stub
		
	}

}
