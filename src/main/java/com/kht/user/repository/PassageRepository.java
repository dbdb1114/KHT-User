package com.kht.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.Passage;

@Repository
public interface PassageRepository extends JpaRepository<Passage, Long> {
}