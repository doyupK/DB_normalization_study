package com.supercarmarket.dev.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.supercarmarket.dev.dto.SignupRequestDto;
import com.supercarmarket.dev.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.will;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
//@WebMvcTest(PostController.class)    이거도 왜 안되지 ?
@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserServiceImpl userService;

    private MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @DisplayName("유저 등록 조회")
    @Test
    public void createUser() throws Exception {

        //given
        SignupRequestDto signupRequestDto=
                SignupRequestDto.builder()
                        .id("testId")
                        .password("testPassword")
                        .nickname("testNickName")
                        .email("test@dev.com")
                        .phoneNumber("010-0000-0100")
                        .build();


//         when(userService.createUser(any(SignupRequestDto.class))).thenReturn("ok"); // stub - 행동 정의
//        will("ok").given(userService.createUser(signupRequestDto));
//        doReturn("ok").when(userService.createUser(any()));
        //when
        ResultActions resultActions = mockMvc.perform(post("/api/v1/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("UTF-8")
                        .content(objectMapper.writeValueAsString(signupRequestDto))
                        .accept(MediaType.APPLICATION_JSON));
        //then
        resultActions
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());
        MvcResult requestResult = resultActions.andReturn();
        String result = requestResult.getResponse().getContentAsString();
        assertEquals("ok",result);
    }



}