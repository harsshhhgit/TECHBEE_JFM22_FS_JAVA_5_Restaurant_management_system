package com.zira.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zira.restaurant.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long>{

}
