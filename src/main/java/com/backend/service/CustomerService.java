package com.backend.service;

import java.util.List;

import com.backend.model.Customer;

public interface CustomerService {

	 long save(Customer customer);

	   Customer get(long customer_id);

	   List<Customer> list();

	   void update(long customer_id, Customer customer);

	   void delete(long customer_id);

}
