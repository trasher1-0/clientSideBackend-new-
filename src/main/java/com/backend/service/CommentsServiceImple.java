package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.dao.CommentsDao;
import com.backend.model.Comments;

@Service
@Transactional(readOnly = true)
public class CommentsServiceImple implements CommentsService{
	
	@Autowired
	private CommentsDao commentDao;

	@Transactional
	@Override
	public long save(Comments comment) {
		return commentDao.save(comment);
	}

	@Override
	public Comments get(long comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> list() {
		return commentDao.list();
	}

	@Transactional
	@Override
	public void update(long comment_id, Comments comment) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(long comment_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comments> getSmallTrasherComments() {
		return commentDao.getSmallTrasherComments();
	}

	@Override
	public List<Comments> getPrimumTrasherComments() {
		return commentDao.getPrimumTrasherComments();
	}

	@Override
	public List<Comments> getLargeTrasherComments() {
		return commentDao.getLargeTrasherComments();
	}

}
