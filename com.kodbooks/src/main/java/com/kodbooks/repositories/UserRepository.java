package com.kodbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbooks.entities.User;

public interface UserRepository 
		extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);

}