package com.zira.restaurant.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator="booking_seq")
	@SequenceGenerator(name = "booking_seq", initialValue=8000)
	private long bookingId;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="venue")
	private String venue;
	
	@Column(name="time")
	private String time;
	
	@Column(name="people")
	private int people;
	
	@Column(name="date")
	private String date;
	
	@Column(name="phone_number")
	private long phoneNumber;
	
//	==============================================
//	=================Constructors=================
//	==============================================

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(long bookingId, String fullName, String venue, String time, int people, String date, long phoneNumber) {
		super();
		this.bookingId = bookingId;
		this.fullName = fullName;
		this.venue = venue;
		this.time = time;
		this.people = people;
		this.date = date;
		this.phoneNumber = phoneNumber;
	}
	

//	==============================================
//	==============Getters and Setters=============
//	==============================================

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	

}
