package com.learnjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
