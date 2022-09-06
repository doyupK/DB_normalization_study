package com.supercarmarket.dev.domain;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
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
