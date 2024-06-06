package com.example.mongodb.controller;

import com.example.mongodb.dto.UserDTO;

public interface UserController {
	UserDTO findUser(String userId);
}
