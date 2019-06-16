package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.InvoicesDao;
import com.backend.model.Invoices;

@Service
@Transactional(readOnly = true)
public class InvoicesServiceImple implements InvoicesService {

	@Autowired
	private InvoicesDao invoicesDao;
	
	@Transactional
	@Override
	public long save(Invoices invoice) {
		System.out.print(true);
		return invoicesDao.save(invoice);
	}

	@Override
	public Invoices get(long invoice_id) {
		return invoicesDao.get(invoice_id);
	}

	@Override
	public List<Invoices> getSelectedCustomerInvoice(long customer_id) {
		return invoicesDao.getSelectedCustomerInvoice(customer_id);
	}
	
	@Override
	public List<Invoices> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void update(long invoice_id, Invoices booking) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}


}
