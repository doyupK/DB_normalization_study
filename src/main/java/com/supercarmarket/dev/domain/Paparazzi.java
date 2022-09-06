package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.enumData.PaparazziRatingEnum;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Paparazzi extends TimeStamped {
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
    String contents;
    int approve;
    int disapprove;
    Long viewCount;
    PaparazziRatingEnum paparazziRatingEnum;

}
