package com.example.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
