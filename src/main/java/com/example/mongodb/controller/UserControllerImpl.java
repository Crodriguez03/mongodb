package com.example.mongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.dto.UserDTO;
import com.example.mongodb.service.UserService;

@RestController
@RequestMapping("user")
public class UserControllerImpl implements UserController {
	
	private final UserService userService;

	public UserControllerImpl(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	@GetMapping("{userId}")
	public UserDTO findUser(@PathVariable String userId) {
		return userService.findUser(userId);
	}	
}
