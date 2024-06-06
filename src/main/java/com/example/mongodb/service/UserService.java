package com.example.mongodb.service;

import com.example.mongodb.dto.UserDTO;

public interface UserService {
	UserDTO findUser(String userId);
}
