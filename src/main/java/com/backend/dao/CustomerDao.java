package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Customer;

public interface CustomerDao {

	   long save(Customer customer);

	   Customer get(long customer_id);

	   List<Customer> list();

	   void update(long customer_id, Customer customer);

	   void delete(long customer_id);

	

}
