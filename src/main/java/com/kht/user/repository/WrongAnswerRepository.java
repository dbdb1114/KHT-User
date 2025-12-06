package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.WrongAnswer;

@Repository
public interface WrongAnswerRepository extends JpaRepository<WrongAnswer, Long> {
}