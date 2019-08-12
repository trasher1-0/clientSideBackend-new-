package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.FeedbackDao;
import com.backend.model.Feedbacks;

@Service
@Transactional(readOnly = true)
public class FeedbacksServiceImple  implements FeedbacksService{

	@Autowired
	private FeedbackDao feedbackDao;
	
	@Transactional
	@Override
	public long save(Feedbacks feedback) {
		return feedbackDao.save(feedback);
	}

	@Override
	public Feedbacks get(long feedback_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedbacks> list() {
		return feedbackDao.list();
	}

	@Transactional
	@Override
	public void update(long feedback_id, Feedbacks feedback) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long feedback_id) {
		// TODO Auto-generated method stub
		
	}

}
