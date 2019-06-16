package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;

public interface BookingDao {

   long save(Booking booking);

   Booking get(long id);

   List<Booking> list();

   void update(long id, Booking booking);

   void delete(long id);

}
