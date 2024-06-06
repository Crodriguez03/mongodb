package com.example.mongodb.repository;

import com.example.mongodb.entity.User;

public interface UserRepository {
	User findById(String id);
}
