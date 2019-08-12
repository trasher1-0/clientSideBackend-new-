package com.backend.service;

import java.util.List;

import com.backend.model.Invoices;

public interface InvoicesService {

	long save(Invoices invoice);

	  Invoices get(long invoice_id);

	   List<Invoices> list();

	   void update(long invoice_id, Invoices booking);

	   void delete(long invoice_id);

	List<Invoices> getSelectedCustomerInvoice(long customer_id);

}

