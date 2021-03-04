package com.guru.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guru.vit.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
