package com.backend.service;

import java.util.List;

import com.backend.model.Timeslots;

public interface TimeslotsService {

	long save(Timeslots timeslot);

	Timeslots get(long invoice_id);

	   List<Timeslots> list();

	   void update(long invoice_id, Timeslots timeslot);

	   void delete(long invoice_id);
}
