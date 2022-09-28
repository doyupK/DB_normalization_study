package com.supercarmarket_test.dev.service.impl;

import com.supercarmarket_test.dev.domain.user.User;
import com.supercarmarket_test.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket_test.dev.domain.enumData.UserRoleEnum;
import com.supercarmarket_test.dev.dto.SignupRequestDto;
import com.supercarmarket_test.dev.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@Slf4j
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;


    @Test
    public void 유저등록(){
        //given
        SignupRequestDto signupRequestDto = SignupRequestDto.builder()
                .id("userId")
                .password("userPassword")
                .email("userEmail")
                .nickname("userNickname")
                .phoneNumber("010-1111-2222")
                .build();

        User user = User.builder()
                .id("userId")
                .password("userPassword")
                .email("userEmail")
                .nickname("userNickname")
                .phoneNumber("010-1111-2222")
                .rating(UserRatingEnum.NORMAL)
                .role(UserRoleEnum.NORMAL)
                .build();
        when(userRepository.save(any())).thenReturn(user);

        //when
        User result = userService.createUser(signupRequestDto);

        //then
        assertEquals(result.getId(), user.getId());
        log.info("User : {} ", result.getId());
        log.info("SignupRequestDto : {} ", user.getId());
        assertEquals(result.getEmail(), user.getEmail());
        assertEquals(result.getNickname(), user.getNickname());
        assertEquals(result.getPhoneNumber(), user.getPhoneNumber());
        assertEquals(result.getRating(), user.getRating());
        assertEquals(result.getRole(), user.getRole());



    }


}