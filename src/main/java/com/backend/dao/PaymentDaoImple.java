package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Payment;

@Repository
public class PaymentDaoImple implements PaymentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Payment payment) {
		sessionFactory.getCurrentSession().save(payment);
		return payment.getId();
	}

	@Override
	public Payment get(long invoice_id) {
		return sessionFactory.getCurrentSession().get(Payment.class,invoice_id);
	}

	@Override
	public List<Payment> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long invoice_id, Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

	
}
