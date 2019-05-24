package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.AuthenticationDao;
import com.backend.model.Authentication;

@Service
@Transactional(readOnly = true)
public class AuthenticationServiceImple implements AuthenticationService{
	
	@Autowired
	private AuthenticationDao authenticationDao;

	@Transactional
	@Override
	public long save(Authentication authentication) {
		return authenticationDao.save(authentication);
	}

	@Override
	public Authentication get(long customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authentication> list() {
		return authenticationDao.list();
	}

	@Transactional
	@Override
	public void update(long customer_id, Authentication authentication) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
