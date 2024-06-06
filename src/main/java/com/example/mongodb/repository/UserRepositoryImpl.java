package com.example.mongodb.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.mongodb.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	private static final String INDEX = "user";
	
    public final MongoTemplate mongoTemplate;
    
    public final ObjectMapper objectMapper;
    
	public UserRepositoryImpl(MongoTemplate mongoTemplate, ObjectMapper objectMapper) {
		this.mongoTemplate = mongoTemplate;
		this.objectMapper = new ObjectMapper();
	}

	@Override
	public User findById(String id) {
		return null;
	}
}
