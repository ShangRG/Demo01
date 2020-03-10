package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void save(User user) {
		
		userRepository.save(user);
		
	}


	@Override
	public User byid(Long id) {
		// TODO Auto-generated method stub
		return userRepository.byid(id);
	}





	


	

}
