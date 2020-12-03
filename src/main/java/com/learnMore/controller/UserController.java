package com.learnMore.controller;

import com.learnMore.dto.SignUpDTO;
import com.learnMore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpDTO dto){
        userService.signUp(dto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
