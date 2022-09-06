package com.supercarmarket.dev.domain;

import javax.persistence.*;

@Entity
public class megazine {
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Category category;

    String title;
    String bannerImageUrl;
    String contents;
}
