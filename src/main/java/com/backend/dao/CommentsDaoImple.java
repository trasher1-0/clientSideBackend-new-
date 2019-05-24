package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Comments;

@Repository
public class CommentsDaoImple implements CommentsDao{

	@Autowired
	private SessionFactory sessionFactory;
	
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

	@Override
	public void update(long comment_id, Comments comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long comment_id) {
		// TODO Auto-generated method stub
		
	}

}
