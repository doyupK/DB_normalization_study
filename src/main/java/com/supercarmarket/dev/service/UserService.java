package com.supercarmarket.dev.service;

import com.supercarmarket.dev.domain.User;
import com.supercarmarket.dev.dto.SignupRequestDto;
import org.springframework.stereotype.Service;

public interface UserService {

    User createUser(SignupRequestDto signupRequestDto);
}
