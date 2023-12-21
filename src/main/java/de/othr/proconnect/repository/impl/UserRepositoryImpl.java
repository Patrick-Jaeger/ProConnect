package de.othr.proconnect.repository.impl;

import org.springframework.data.repository.CrudRepository;

import de.othr.proconnect.model.User;
import de.othr.proconnect.repository.UserRepositoryI;

public interface UserRepositoryImpl extends UserRepositoryI, CrudRepository<User, Long> {

}
