package com.zira.restaurant.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String email;
	private String name; 
	private String password; 
	private String mobile;
	private String address;
	
//	==============================================
//	=================Constructors=================
//	==============================================

	public User(Long id, String email, String name, String password, String mobile, String address) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}

	public User() {
		super();
	}
	
//	==============================================
//	==============Getters and Setters=============
//	==============================================

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

		
}

