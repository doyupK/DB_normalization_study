package com.supercarmarket_test.dev.service;

import com.supercarmarket_test.dev.domain.user.User;
import com.supercarmarket_test.dev.dto.SignupRequestDto;

public interface UserService {

    User createUser(SignupRequestDto signupRequestDto);
}
