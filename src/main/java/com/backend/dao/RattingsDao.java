package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Rattings;

public interface RattingsDao {

	long save(Rattings ratting);

	  Rattings get(long ratting_id);

	   List<Rattings> list();

	   void update(long ratting_id, Rattings ratting);

	   void delete(long ratting_id);

	List<Rattings> checkRated(Long customer_id);

	List<Rattings> getSmallTrasherRattings();
	
	List<Rattings> getPrimumTrasherRattings();
	
	List<Rattings> getLargeTrasherRattings();

}
