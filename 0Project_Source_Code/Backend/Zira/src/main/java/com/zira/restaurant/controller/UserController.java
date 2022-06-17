package com.zira.restaurant.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zira.restaurant.model.Menu;
import com.zira.restaurant.model.User;

import com.zira.restaurant.service.UserService;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	  private PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
	  
	  private String encryptPwd;
	
	//creating user
	@PostMapping("signup") 
	public User createUser(@RequestBody User user) throws Exception {
	//  encryptPwd= passwordEncoder.encode(user.getPassword());
//	    user.setPassword(encryptPwd);
		return this.userService.createUser(user);
	}
	
	//find user by email
	@GetMapping("{email}")
	public User getUser(@PathVariable("email") String email) {
		
		return this.userService.getUser(email);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		 return userService.getUsers();
	 }
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam Long id) {
		userService.deleteUser(id);
	}
	
	//login 
	@PostMapping("login")
	
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailid=user.getEmail();
		String tempPass=user.getPassword();
		User userobj=null;
	//  if(passwordEncoder.matches(encryptPwd, tempPass)) {
		if(tempEmailid != null && tempPass != null ) {
			userobj=userService.fetchUserByEmailAndPassword(tempEmailid, tempPass);
			
		}
//	}
		if(userobj==null) {
			throw new Exception("User doesn't exist");
		}
		return userobj;
	}
	
	
}

