package com.backend.service;

import java.util.List;

import com.backend.dao.PaymentDao;
import com.backend.model.Authentication;
import com.backend.model.Payment;

public interface PaymentService {

	long save(Payment payment);

	   PaymentDao get(long invoice_id);

	   List<PaymentDao> list();

	   void update(long invoice_id, PaymentDao paymentDao);

	   void delete(long invoice_id);
}
