package com.posts.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.posts.entities.Post;

@Controller
public class NavController {
	@GetMapping("/")
	public String newPost() {
		return "newPost";
	}
	 @GetMapping("/createPost")
	    public String createPost() {
	        return "createPost";
	    }
	 
		
		
}
