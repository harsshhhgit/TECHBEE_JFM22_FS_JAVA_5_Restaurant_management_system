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

import com.zira.restaurant.model.Feedback;
import com.zira.restaurant.repository.FeedbackRepository;
import com.zira.restaurant.service.FeedbackService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/registerFeedback")
	public void registerFeedback(@RequestBody Feedback feedback) {
		feedbackService.registerFeedback(feedback);
	}
	
	@GetMapping("/getFeedbacks")
	public List<Feedback> getFeedback(){
		return feedbackService.getFeedback();
	}

}
