package com.practice.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.model.UserDetails;
import com.practice.springboot.repository.UserDetailsRepo;

@Service
public class UserDetailsService {

	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	public List<UserDetails> getAllUsers(){
		List<UserDetails> users = new ArrayList<>();
		userDetailsRepo.findAll().forEach(user -> users.add(user));
		return users;
	}
	
	public void saveUser(UserDetails user) {
		userDetailsRepo.save(user);
	}
}
