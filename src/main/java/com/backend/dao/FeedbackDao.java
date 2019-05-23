package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Feedbacks;

public interface FeedbackDao {

	  long save(Feedbacks feedback);

	   Feedbacks get(long feedback_id);

	   List<Feedbacks> list();

	   void update(long feedback_id, Feedbacks feedback);

	   void delete(long feedback_id);

}
