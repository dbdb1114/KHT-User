package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.ResourceAnalysisQuizz;

@Repository
public interface ResourceAnalysisQuizzRepository extends JpaRepository<ResourceAnalysisQuizz, Long> {
}