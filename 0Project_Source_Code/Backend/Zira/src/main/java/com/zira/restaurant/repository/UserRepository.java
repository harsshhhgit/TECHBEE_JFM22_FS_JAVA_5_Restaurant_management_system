package com.zira.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zira.restaurant.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	public User findByEmail(String Email);
	public User findByEmailAndPassword(String email,String password);
	
}