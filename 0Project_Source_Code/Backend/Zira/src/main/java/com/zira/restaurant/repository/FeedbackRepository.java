package com.zira.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zira.restaurant.model.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long>{

}
