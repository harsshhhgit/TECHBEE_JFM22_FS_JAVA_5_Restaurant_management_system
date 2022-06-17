package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Booking;
import com.zira.restaurant.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking registerBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public List<Booking> getBooking(){
		return (List<Booking>) bookingRepository.findAll();
	}
	
	public void deleteBooking(Long bookingId){
		bookingRepository.deleteById(bookingId);
	}
	
	public Booking updateBooking(Booking booking) {
		Long id = booking.getBookingId();
		Booking btd = bookingRepository.findById(id).get();
		btd.setFullName(booking.getFullName());
		btd.setVenue(booking.getVenue());
		btd.setPeople(booking.getPeople());
		btd.setTime(booking.getTime());
		btd.setDate(booking.getDate());
		btd.setPhoneNumber(booking.getPhoneNumber());
		return bookingRepository.save(btd);
	}

}






