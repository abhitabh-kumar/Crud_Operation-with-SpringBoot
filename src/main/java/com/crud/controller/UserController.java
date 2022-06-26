package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.User;
import com.crud.service.Impl.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return ResponseEntity.ok(userServiceImpl.createUser(user));
	}
	
	@GetMapping("/get/{id}")
	public User getUser(@PathVariable Long id) {
		return userServiceImpl.getUser(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userServiceImpl.deleteUser(id);
	}
	
	
	
	
}
