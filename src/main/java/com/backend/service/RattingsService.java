package com.backend.service;

import java.util.List;

import com.backend.model.Rattings;

public interface RattingsService {

	long save(Rattings ratting);

	Rattings get(long ratting_id);

	List<Rattings> list();

	void update(long ratting_id, Rattings ratting);

	void delete(long ratting_id);

	List<Rattings> checkRatted(Long customer_id);

	List<Rattings> getSmallTrasherRattings();
	
	List<Rattings> getPrimumTrasherRattings();
	
	List<Rattings> getLargeTrasherRattings();

}
