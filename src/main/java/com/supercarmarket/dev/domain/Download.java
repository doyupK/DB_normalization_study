package com.supercarmarket.dev.domain;

import javax.persistence.*;

@Entity
public class Download extends TimeStamped{
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    User user;

    String title;
    String contents;
    int like;
    int notLike;
    Long viewCount;
    String attachmentUrl;
}
