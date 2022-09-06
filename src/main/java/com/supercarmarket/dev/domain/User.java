package com.supercarmarket.dev.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "user_table")
public class User extends TimeStamped {
    @Id
    @GeneratedValue
    Long seq;

    String id;
    String nickname;
    String email;
    String phoneNumber;
    UserRatingEnum rating;
    UserRoleEnum role;

}
