package com.example.springit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	Optional<User> findByEmail(String email);
}
