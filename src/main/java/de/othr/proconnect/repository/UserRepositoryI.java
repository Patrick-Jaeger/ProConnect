package de.othr.proconnect.repository;

import de.othr.proconnect.model.User;

public interface UserRepositoryI extends MyBaseRepository<User, Long> {
	
	void deleteById(Long userId);
	
}
