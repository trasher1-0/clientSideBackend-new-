package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.PaymentDao;
import com.backend.model.Payment;
@Service
@Transactional(readOnly = true)
public class PaymentServiceImple implements PaymentService{
	
	@Autowired
	private PaymentDao paymentDao;

	@Transactional
	@Override
	public long save(Payment payment) {
		return paymentDao.save(payment);
	}

	@Override
	public PaymentDao get(long invoice_id) {
		return (PaymentDao) paymentDao.get(invoice_id);
	}

	@Override
	public List<PaymentDao> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void update(long invoice_id, PaymentDao paymentDao) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
