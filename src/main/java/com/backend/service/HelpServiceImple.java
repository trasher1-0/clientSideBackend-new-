package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.HelpDao;
import com.backend.model.Help;

@Service
@Transactional(readOnly = true)
public class HelpServiceImple implements HelpService {

	@Autowired
	private HelpDao helpDao;
	
	@Transactional
	@Override
	public long save(Help help) {
		return helpDao.save(help);
	}

	@Override
	public Help get(long help_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Help> list() {
		return helpDao.list();
	}

	@Transactional
	@Override
	public void update(long help_id, Help help) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long help_id) {
		// TODO Auto-generated method stub
		
	}

}
