package com.backend.service;

import java.util.List;

import com.backend.model.Comments;

public interface CommentsService {

	long save(Comments comment);

	   Comments get(long comment_id);

	   List<Comments> list();

	   void update(long comment_id, Comments comment);

	   void delete(long comment_id);

	List<Comments> getSmallTrasherComments();
	
	List<Comments> getPrimumTrasherComments();
	
	List<Comments> getLargeTrasherComments();
}
