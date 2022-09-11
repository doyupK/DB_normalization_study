package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket.dev.domain.enumData.UserRoleEnum;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "user_table")
public class User extends TimeStamped {
    @Id
    @GeneratedValue
    Long seq;

    String id;
    String password;
    String nickname;
    String email;
    String phoneNumber;
    @Enumerated(EnumType.STRING) // ORDINAL의 순서가 아닌 문자열 값으로 들어가야 추후 ENUM이 추가되었을때 DB가 꼬이지 않는다
    UserRatingEnum rating;
    @Enumerated(EnumType.STRING)
    UserRoleEnum role;
}