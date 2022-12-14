package com.supercarmarket_test.dev.controller;

import com.supercarmarket_test.dev.dto.SignupRequestDto;
import com.supercarmarket_test.dev.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @PostMapping("/api/v1/user")
    public ResponseEntity<?> createUser(@RequestBody SignupRequestDto signupRequestDto) {
        return new ResponseEntity<>(userService.createUser(signupRequestDto), HttpStatus.CREATED);
    }

}
