package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Invoices;

@Repository
public class InvoicesDaoImple implements InvoicesDao {

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Invoices invoice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invoices get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoices> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long invoice_id, Invoices booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
