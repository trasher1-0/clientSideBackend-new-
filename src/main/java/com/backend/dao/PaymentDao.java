package com.backend.dao;

import java.util.List;

import com.backend.model.Payment;

public interface PaymentDao {

		long save(Payment payment );

	   Payment get(long invoice_id);

	   List<Payment> list();

	   void update(long invoice_id, Payment payment);

	   void delete(long invoice_id);
}
