package com.supercarmarket.dev.domain;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue
    Integer seq;

    String categoryName;

    @OneToOne
    Category category;
}
