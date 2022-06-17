package com.zira.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zira.restaurant.model.Booking;
import com.zira.restaurant.repository.BookingRepository;
import com.zira.restaurant.service.BookingService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/registerBooking")
	public void registerBooking(@RequestBody Booking booking) {
		bookingService.registerBooking(booking);
	}
	
	@GetMapping("/getBookings")
	public List<Booking> getBooking(){
		return bookingService.getBooking();
	}
	
	@DeleteMapping("/deleteBooking")
	public void deleteBooking(@RequestParam Long bookingId){
		bookingService.deleteBooking(bookingId);
	}
	
	@PutMapping("/updateBooking")
	public Booking updateBooking(@RequestBody Booking booking) {
		return bookingService.updateBooking(booking);
	}
	
	
}










