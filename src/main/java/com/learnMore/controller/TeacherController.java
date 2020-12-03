package com.learnMore.controller;

import com.learnMore.dto.SignUpDTO;
import com.learnMore.dto.TeacherDTO;
import com.learnMore.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping(value = "/signup")
    public ResponseEntity<?> signUpTeacher(@RequestBody TeacherDTO dto){
        teacherService.signUpTeacher(dto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(value = "/fetch/{subject}")
    public List<TeacherDTO> getTeachers(@PathVariable("subject") String subject){
        return teacherService.getTeachers(subject);

    }
}
