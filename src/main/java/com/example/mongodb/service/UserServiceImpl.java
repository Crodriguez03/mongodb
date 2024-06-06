package com.example.mongodb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.mongodb.dto.UserDTO;
import com.example.mongodb.entity.User;
import com.example.mongodb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDTO findUser(String userId) {
		User user = userRepository.findById(userId);
		return null;
	}
}
