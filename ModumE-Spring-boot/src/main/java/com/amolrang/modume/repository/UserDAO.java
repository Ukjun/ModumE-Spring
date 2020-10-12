package com.amolrang.modume.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amolrang.modume.mapper.UserMapper;
import com.amolrang.modume.model.UserModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class UserDAO {
	@Autowired
	UserMapper userMapper;

	public UserModel findById(String username) {
		return userMapper.readUser(username);
	}

	public UserModel save(UserModel userModel, String role) {
		userMapper.insertUser(userModel);
		userMapper.insertUserAutority(userModel.getId(), role);
		return userModel;
	}

	public List<String> findAuthoritiesByID(String username) {
		return userMapper.readautorities(username);
	}
}
