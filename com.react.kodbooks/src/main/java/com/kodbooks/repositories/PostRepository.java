package com.kodbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbooks.entities.Post;

public interface PostRepository 
		extends 
		JpaRepository<Post, Long> {

}