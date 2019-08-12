package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Timeslots;

public interface TimeslotsDao {

	long save(Timeslots timeslot);

	Timeslots get(long invoice_id);

	   List<Timeslots> list();

	   void update(long invoice_id, Timeslots timeslot);

	   void delete(long invoice_id);

}
