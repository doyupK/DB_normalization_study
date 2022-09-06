package com.supercarmarket.dev.domain;

import javax.persistence.*;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    Product product;
    String productUrl;



}
