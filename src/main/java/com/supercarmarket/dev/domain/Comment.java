package com.supercarmarket.dev.domain;

import javax.persistence.*;

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
