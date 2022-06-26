package com.crud.service;

import com.crud.entity.User;

public interface UserService {
 
	public User createUser(User user);
	
	public User getUser(Long id);
	
	public void deleteUser(Long id);
	
	
}
