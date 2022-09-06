package com.supercarmarket.dev.domain;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class ProductImage {
    @Id
    @GeneratedValue
    Long seq;

    @ManyToOne
    Product product;
    String productUrl;



}
