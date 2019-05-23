package com.backend.dao;

import java.util.List;

import com.backend.model.Authentication;
import com.backend.model.Booking;

public interface AuthenticationDao {

	   long save(Authentication authentication);

	   Authentication get(long customer_id);

	   List<Authentication> list();

	   void update(long customer_id, Authentication authentication);

	   void delete(long customer_id);

}

