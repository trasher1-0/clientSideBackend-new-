package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.RattingsDao;
import com.backend.model.Rattings;

@Service
@Transactional(readOnly = true)
public class RattingsServiceImple implements RattingsService {

	@Autowired
	private RattingsDao rattingsDao;
	
	@Transactional
	@Override
	public long save(Rattings ratting) {
		return rattingsDao.save(ratting);
	}

	@Override
	public Rattings get(long ratting_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Rattings> isRatedForSmallTrasher(long customer_id) {
		return rattingsDao.isRatedForSmallTrasher(customer_id);
	}
	
	@Override
	public List<Rattings> isRatedForPrimumTrasher(long customer_id) {
		return rattingsDao.isRatedForPrimumTrasher(customer_id);
	}
	
	@Override
	public List<Rattings> isRatedForLargeTrasher(long customer_id) {
		return rattingsDao.isRatedForLargeTrasher(customer_id);
	}

	@Override
	public List<Rattings> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void update(long ratting_id, Rattings ratting) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long ratting_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rattings> checkRatted(Long customer_id) {
		return rattingsDao.checkRated(customer_id);
	}

	@Override
	public List<Rattings> getSmallTrasherRattings() {
		return rattingsDao.getSmallTrasherRattings();
	}

	@Override
	public List<Rattings> getPrimumTrasherRattings() {
		return rattingsDao.getPrimumTrasherRattings();
	}

	@Override
	public List<Rattings> getLargeTrasherRattings() {
		return rattingsDao.getLargeTrasherRattings();
	}

}
