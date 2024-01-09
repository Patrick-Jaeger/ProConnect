package de.othr.proconnect.repository;

import de.othr.proconnect.model.User;

import java.util.UUID;

public interface UserRepositoryI extends MyBaseRepository<User, Long> {


	void deleteById(long userId);
	
}
