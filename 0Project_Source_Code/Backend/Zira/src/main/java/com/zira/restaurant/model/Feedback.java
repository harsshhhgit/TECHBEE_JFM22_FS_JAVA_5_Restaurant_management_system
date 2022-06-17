package com.zira.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator="feedback_seq")
	@SequenceGenerator(name = "feedback_seq", initialValue=8000)
	private long feedbackId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="description")
	private String description;
	
//	==============================================
//	=================Constructors=================
//	==============================================
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(long feedbackId, String name, String email, String subject, String description) {
		super();
		this.feedbackId = feedbackId;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.description = description;
	}

//	==============================================
//	==============Getters and Setters=============
//	==============================================

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
