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
		sessionFactory.getCurrentSession().save(comment);
		return comment.getComment_id();
	}

	@Override
	public Comments get(long comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> list() {
		List<Comments> allComments=sessionFactory.getCurrentSession().createQuery("from Comments").list();
		return allComments;
	}

	@Override
	public void update(long comment_id, Comments comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long comment_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comments> getSmallTrasherComments() {
		List<Comments> smallTrasherComments=sessionFactory.getCurrentSession().createQuery("from Comments comment where comment.trasher_type=1").list();
		return smallTrasherComments;
	}

	@Override
	public List<Comments> getPrimumTrasherComments() {
		List<Comments> primumTrasherComments=sessionFactory.getCurrentSession().createQuery("from Comments comment where comment.trasher_type=2").list();
		return primumTrasherComments;
	}
	
	@Override
	public List<Comments> getLargeTrasherComments() {
		List<Comments> largeTrasherComments=sessionFactory.getCurrentSession().createQuery("from Comments comment where comment.trasher_type=3").list();
		return largeTrasherComments;
	}

}
