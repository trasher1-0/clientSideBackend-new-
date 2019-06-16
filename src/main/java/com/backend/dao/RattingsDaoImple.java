package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Rattings;

@Repository
public class RattingsDaoImple implements RattingsDao{

	@Autowired
   private SessionFactory sessionFactory;
	
	@Override
	public long save(Rattings ratting) {
		sessionFactory.getCurrentSession().save(ratting);
		return ratting.getRatting_id();
	}

	@Override
	public Rattings get(long ratting_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Rattings> isRatedForSmallTrasher(long customer_id) {
		List<Rattings> ratting=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.customer_id=customer_id and trasher_type=1").list();
		return ratting;
	}

	@Override
	public List<Rattings> isRatedForPrimumTrasher(long customer_id) {
		List<Rattings> ratting=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.customer_id=customer_id and trasher_type=2").list();
		return ratting;
	}
	
	@Override
	public List<Rattings> isRatedForLargeTrasher(long customer_id) {
		List<Rattings> ratting=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.customer_id=customer_id and trasher_type=3").list();
		return ratting;
	}
	
	@Override
	public List<Rattings> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long ratting_id, Rattings ratting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long ratting_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rattings> checkRated(Long customer_id) {
		List<Rattings> ratting=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.customer_id=2").list();
		return ratting;
	}

	@Override
	public List<Rattings> getSmallTrasherRattings() {
		List<Rattings> smallTrasherRattings=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.trasher_type = 1").list();
		return smallTrasherRattings;
	}

	@Override
	public List<Rattings> getPrimumTrasherRattings() {
		List<Rattings> primumTrasherRattings=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.trasher_type = 2").list();
		return primumTrasherRattings;
	}

	@Override
	public List<Rattings> getLargeTrasherRattings() {
		List<Rattings> largeTrasherRattings=sessionFactory.getCurrentSession().createQuery("from Rattings ratting where ratting.trasher_type = 3").list();
		return largeTrasherRattings;
	}

	

	

	

}
