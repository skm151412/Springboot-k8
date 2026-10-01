package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.AppUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

Optional<AppUser> findByUsername(String username);

}