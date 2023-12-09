package de.othr.proconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.othr.proconnect.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
