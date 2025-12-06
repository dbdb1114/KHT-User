package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.ProblemChoice;

@Repository
public interface ProblemChoiceRepository extends JpaRepository<ProblemChoice, Long> {
}