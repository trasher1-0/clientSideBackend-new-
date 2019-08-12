package com.backend.service;

import java.util.List;

import com.backend.model.Authentication;

public interface AuthenticationService {

	long save(Authentication authentication);

	   Authentication get(long customer_id);

	   List<Authentication> list();

	   void update(long customer_id, Authentication authentication);

	   void delete(long customer_id);
}
