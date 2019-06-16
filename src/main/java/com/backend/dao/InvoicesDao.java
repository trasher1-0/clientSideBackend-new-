package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Invoices;

public interface InvoicesDao {

	  long save(Invoices invoice);

	  Invoices get(long invoice_id);

	   List<Invoices> list();

	   void update(long invoice_id, Invoices booking);

	   void delete(long invoice_id);

	List<Invoices> getSelectedCustomerInvoice(long customer_id);

}
