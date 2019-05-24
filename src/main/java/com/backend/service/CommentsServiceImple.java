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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Comments get(long comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> list() {
		// TODO Auto-generated method stub
		return null;
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

}
