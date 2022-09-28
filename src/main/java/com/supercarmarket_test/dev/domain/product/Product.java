package com.supercarmarket_test.dev.domain.product;

import com.supercarmarket_test.dev.domain.TimeStamped;
import com.supercarmarket_test.dev.domain.user.User;
import com.supercarmarket_test.dev.domain.enumData.ProductRatingEnum;
import com.supercarmarket_test.dev.domain.enumData.ProductStatusEnum;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends TimeStamped {
    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    private User user;
    @ManyToOne
    private Category category;
    private String title;
    private String  subtitle;
    private int price;
    private String contents;
    private String performanceUrl;    //성능검사표
    private String insuranceUrl;     //보험이력
    private ProductStatusEnum productStatusEnum;
    private ProductRatingEnum productRatingEnum;
    private boolean appear;

}
