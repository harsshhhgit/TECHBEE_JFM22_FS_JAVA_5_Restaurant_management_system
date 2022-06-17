package com.zira.restaurant.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator="supplier_seq")
	@SequenceGenerator(name = "supplier_seq", initialValue=4000)
	private long supplierId;
	
	@Column(name="first_name")
	private String firstName;
	 
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="phone_number")
	private long phoneNumber;
	
	
//	==============================================
//	=================Constructors=================
//	==============================================

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Supplier(long supplierId, String firstName, String lastName, String city, String emailId, long phoneNumber) {
		super();
		this.supplierId = supplierId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}


//	==============================================
//	==============Getters and Setters=============
//	==============================================
	
	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
