package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.Problem;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Long> {
}