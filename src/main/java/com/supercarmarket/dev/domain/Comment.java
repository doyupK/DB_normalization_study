package com.supercarmarket.dev.domain;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue
    Long seq;
    @ManyToOne
    User User;
    @ManyToOne
    Paparazzi paparazzi;
    String contents;


}
