package com.supercarmarket_test.dev.service.impl;

import com.supercarmarket_test.dev.domain.user.User;
import com.supercarmarket_test.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket_test.dev.domain.enumData.UserRoleEnum;
import com.supercarmarket_test.dev.dto.SignupRequestDto;
import com.supercarmarket_test.dev.repository.UserRepository;
import com.supercarmarket_test.dev.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(SignupRequestDto signupRequestDto) {
        User user = User.builder()
                .id(signupRequestDto.getId())
                .email(signupRequestDto.getEmail())
                .password(signupRequestDto.getPassword())
                .nickname(signupRequestDto.getNickname())
                .phoneNumber(signupRequestDto.getPhoneNumber())
                .rating(UserRatingEnum.NORMAL)
                .role(UserRoleEnum.NORMAL)
                .build();

        return userRepository.save(user);
    }
}
