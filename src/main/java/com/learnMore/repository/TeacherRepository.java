package com.learnMore.repository;

import com.learnMore.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {


    List<Teacher> getTeacherBySubject(String subject);
}
