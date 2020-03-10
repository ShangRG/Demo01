package com.example.demo.service;



import com.example.demo.entity.User;

public interface UserService {

	
	public void save(User user);
	
	
	public User byid(Long id);
}
