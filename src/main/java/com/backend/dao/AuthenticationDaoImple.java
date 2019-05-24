package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Authentication;

@Repository
public class AuthenticationDaoImple implements AuthenticationDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(Authentication authentication) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Authentication get(long customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authentication> list() {
		List<Authentication> customerList=sessionFactory.getCurrentSession().createQuery("from Authentication").list();
		return customerList; 
	}

	@Override
	public void update(long customer_id, Authentication authentication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
