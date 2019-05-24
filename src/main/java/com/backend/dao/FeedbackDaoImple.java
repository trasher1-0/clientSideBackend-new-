package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Feedbacks;

@Repository
public class FeedbackDaoImple implements FeedbackDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Feedbacks feedback) {
		sessionFactory.getCurrentSession().save(feedback);
		return feedback.getFeedback_id();
	}

	@Override
	public Feedbacks get(long feedback_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedbacks> list() {
		List<Feedbacks> allFeedbacks=sessionFactory.getCurrentSession().createQuery("from Feedbacks").list();
		return allFeedbacks;
	}

	@Override
	public void update(long feedback_id, Feedbacks feedback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long feedback_id) {
		// TODO Auto-generated method stub
		
	}

}
