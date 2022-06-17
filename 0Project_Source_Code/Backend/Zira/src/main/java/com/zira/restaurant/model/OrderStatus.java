package com.zira.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_status")
public class OrderStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
	@SequenceGenerator(name = "order_seq", initialValue = 6000)
	private long orderId;

	@Column(name = "customer_id")
	private long customerId;

	@Column(name = "location")
	private String location;

	@Column(name = "status")
	private String status;

	@Column(name = "price")
	private String price;

//	==============================================
//	=================Constructors=================
//	==============================================

	public OrderStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderStatus(long orderId, long customerId, String location, String status, String price) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.location = location;
		this.status = status;
		this.price = price;
	}

//	==============================================
//	==============Getters and Setters=============
//	==============================================

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	
}
