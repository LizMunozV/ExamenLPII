package com.example.subject_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subject_management.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
