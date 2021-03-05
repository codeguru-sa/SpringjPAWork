package com.guru.vit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guru.vit.model.User;

@Service
public interface UserService {
	
	List<User> getUsers();
	
	void saveUser(User user);
	
	User getUserById(long id);
	
	void deleteUserById(long id);

}
