package com.supercarmarket.dev.dto;

import com.supercarmarket.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket.dev.domain.enumData.UserRoleEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignupResponseDto {
    String id;
    String nickname;
    String email;
    String phoneNumber;
    UserRatingEnum userRatingEnum;
    UserRoleEnum userRoleEnum;
}
