package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Customer;

@Repository
public class CustomerDaoImple implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer get(long customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long customer_id, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
