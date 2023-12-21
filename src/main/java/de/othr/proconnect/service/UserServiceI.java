package de.othr.proconnect.service;

import java.util.List;

import de.othr.proconnect.model.User;

public interface UserServiceI {
	
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(Long userID);
	
	User updateUser(User user);
	
	void deleteUserById(Long userID);
}
