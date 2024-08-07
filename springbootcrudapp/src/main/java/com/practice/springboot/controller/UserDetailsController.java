package com.practice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.model.UserDetails;
import com.practice.springboot.service.UserDetailsService;

@RestController
public class UserDetailsController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@GetMapping("/users")
	private List<UserDetails> getAllUsers(){
		return userDetailsService.getAllUsers();
	}
	
	@PostMapping("/save")
	private int saveuser(@RequestBody UserDetails user){
		userDetailsService.saveUser(user);
		return user.getId();
	}
	

}
