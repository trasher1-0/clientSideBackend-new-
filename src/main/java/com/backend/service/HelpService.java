package com.backend.service;

import java.util.List;

import com.backend.model.Help;

public interface HelpService {

	long save(Help help);

	   Help get(long help_id);

	   List<Help> list();

	   void update(long help_id, Help help);

	   void delete(long help_id);
}
