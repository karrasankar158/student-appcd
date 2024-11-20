package com.fsd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    //http://localhost:8080/api/student/welcome
    @GetMapping("/welcome")
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>("Welcome to FSD", HttpStatus.OK);
    }
}
