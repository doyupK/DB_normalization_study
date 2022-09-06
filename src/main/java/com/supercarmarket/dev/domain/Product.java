package com.supercarmarket.dev.domain;

import javax.persistence.*;

@Entity
public class Product extends TimeStamped {
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    User user;
    @ManyToOne
    Category category;
    String title;
    String  subtitle;
    int price;
    String contents;
    String performanceUrl;    //성능검사표
    String insuranceUrl;     //보험이력
    ProductStatusEnum productStatusEnum;
    ProductRatingEnum productRatingEnum;
    boolean appear;

}
