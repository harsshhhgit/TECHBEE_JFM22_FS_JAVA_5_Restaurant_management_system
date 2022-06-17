//package com.zira.restaurant.service;
//
//import java.util.List;
//import java.util.Set;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.zira.restaurant.model.User;
//
//
//import com.zira.restaurant.repository.UserRepository;
//
////@Service
////public class UserServiceImpl implements UserService {
////
////	@Autowired
////	private UserRepository userRepository;
////	
////	
////	
////	@Override
////	public User createUser(User user) throws Exception {
////		
////		User local = this.userRepository.findByEmail(user.getEmail());
////		if(local!=null) {
////			System.out.println("user is already there !");
////			throw new Exception("User already present");
////		}
////		else {
////			//user create 
////			local = this.userRepository.save(user);
////		}
////		return local;
////	}
////
////	@Override
////	public User getUser(String email) {
////		
////		return this.userRepository.findByEmail(email);
////	}
////	
////	public User fetchUserByEmailAndPassword(String email,String password) {
////		return userRepository.findByEmailAndPassword(email,password);
////	}
////	
////	public List<User> getUsers() {
////		return (List<User>) userRepository.findAll();
////	}
////	
////	
////	
////	
////
////}
//
//
////@Service
////public class UserServiceImpl {
////
////	@Autowired
////	private UserRepository userRepository;
////
////	public User registerMenu(User user) {
////		return userRepository.save(user);
////	}
////
////	public User createUser(User user) throws Exception {
////		
////		User local = this.userRepository.findByEmail(user.getEmail());
////		if(local!=null) {
////			System.out.println("user is already there !");
////			throw new Exception("User already present");
////		}
////		else {
////			//user create 
////			local = this.userRepository.save(user);
////		}
////		return local;
////	}
////	
////	public User getUser(String email) {
////		
////		return this.userRepository.findByEmail(email);
////	}
////	
////	public User fetchUserByEmailAndPassword(String email,String password) {
////		return userRepository.findByEmailAndPassword(email,password);
////	}
////
////	public void deleteUser(Long id) {
////		userRepository.deleteById(id);
////	}	 
////
////}
//
//
