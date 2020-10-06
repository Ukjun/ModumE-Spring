package com.amolrang.modume.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amolrang.modume.user.model.UserDMI;

@Service
public class UserService {
	@Autowired
	private UserMapper mapper;

	public int login(UserDMI param) {
		
		return 0;
	}

}
