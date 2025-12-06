package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.OxQuizz;

@Repository
public interface OxQuizzRepository extends JpaRepository<OxQuizz, Long> {
}