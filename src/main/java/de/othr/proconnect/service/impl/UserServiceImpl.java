package de.othr.proconnect.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import de.othr.proconnect.model.User;
import de.othr.proconnect.repository.UserRepositoryI;
import de.othr.proconnect.service.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI {
	
	private UserRepositoryI userRepository;
	
	public UserServiceImpl(UserRepositoryI userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long userID) {
		// TODO Auto-generated method stub
		return userRepository.findById(userID).get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long userID) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userID);
		System.out.println("User deleteted");
	}

}
