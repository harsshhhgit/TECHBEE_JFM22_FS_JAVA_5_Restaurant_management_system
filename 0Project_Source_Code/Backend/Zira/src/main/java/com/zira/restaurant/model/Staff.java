package com.zira.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 @Column(name="first_name")
 private String firstName;
 
 @Column(name="last_name")
 private String lastName;
 
 @Column(name="email_id")
 private String emailId;
 
 @Column(name="designation")
 private String designation;
 
 @Column(name="phone_number")
 private long phoneNumber;
 
 
//	==============================================
//	=================Constructors=================
//	==============================================

 
 public Staff() {
  super();
  // TODO Auto-generated constructor stub
 }
 
 public Staff(long id, String firstName, String lastName, String emailId, String designation, long phoneNumber) {
  super();
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.emailId = emailId;
  this.designation = designation;
  this.phoneNumber = phoneNumber;
 }
 
//	==============================================
//	==============Getters and Setters=============
//	==============================================
 
 public long getId() {
  return id;
 }
 public void setId(long id) {
  this.id = id;
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
 public String getDesignation() {
  return designation;
 }
 public void setDesignation(String designation) {
  this.designation = designation;
 }
 public long getPhoneNumber() {
  return phoneNumber;
 }
 public void setPhoneNumber(long phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

}