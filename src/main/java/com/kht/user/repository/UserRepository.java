package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}