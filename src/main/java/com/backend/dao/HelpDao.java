package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.Help;

public interface HelpDao {

	long save(Help help);

	   Help get(long help_id);

	   List<Help> list();

	   void update(long help_id, Help help);

	   void delete(long help_id);

}
