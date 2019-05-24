package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.CustomerDao;
import com.backend.model.Customer;

@Service
@Transactional(readOnly = true)
public class CustomerServiceImple implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
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

	@Transactional
	@Override
	public void update(long customer_id, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
