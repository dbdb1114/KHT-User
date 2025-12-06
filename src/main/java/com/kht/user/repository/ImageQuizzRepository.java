package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.ImageQuizz;

@Repository
public interface ImageQuizzRepository extends JpaRepository<ImageQuizz, Long> {
}