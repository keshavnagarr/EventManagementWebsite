package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.User;
import com.demo.repository.UserRepository;


import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	@Autowired
	UserRepository repo;
	
	
	public String createUser(User user) {
		 repo.save(user);
		return "";
	}
	
}
