package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Help;

@Repository
public class HelpDaoImple implements HelpDao {

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Help help) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Help get(long help_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Help> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long help_id, Help help) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long help_id) {
		// TODO Auto-generated method stub
		
	}

}
