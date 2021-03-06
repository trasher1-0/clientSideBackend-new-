package com.backend.service;

import java.util.List;

import com.backend.model.Booking;

public interface BookingService {

   long save(Booking booking);
   Booking get(long id);
   List<Booking> list();
   void update(long id, Booking booking);
   void delete(long id);
}
