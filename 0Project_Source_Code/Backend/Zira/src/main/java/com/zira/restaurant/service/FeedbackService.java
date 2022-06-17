package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Feedback;
import com.zira.restaurant.repository.FeedbackRepository;


@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	public Feedback registerFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	public List<Feedback> getFeedback() {
		return (List<Feedback>) feedbackRepository.findAll();
	}
	
}
