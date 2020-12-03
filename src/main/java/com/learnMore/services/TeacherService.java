package com.learnMore.services;

import com.learnMore.dto.TeacherDTO;
import com.learnMore.entity.Teacher;

import java.util.List;

public interface TeacherService {

    void signUpTeacher(TeacherDTO dto);

    List<TeacherDTO> getTeachers(String subject);
}
