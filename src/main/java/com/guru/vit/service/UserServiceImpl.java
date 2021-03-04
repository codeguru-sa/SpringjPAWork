package com.guru.vit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.guru.vit.model.User;
import com.guru.vit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Bean
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(User user) {
		this.userRepository.save(user);
	}

}
