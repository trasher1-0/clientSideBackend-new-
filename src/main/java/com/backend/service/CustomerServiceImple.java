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
		System.out.println("Check");
		return customerDao.save(customer);
	}

	@Override
	public Customer get(long customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> list() {
		return customerDao.list();
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
