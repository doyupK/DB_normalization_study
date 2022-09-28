package com.supercarmarket_test.dev.domain.paparazzi;

import com.supercarmarket_test.dev.domain.TimeStamped;
import com.supercarmarket_test.dev.domain.user.User;
import com.supercarmarket_test.dev.domain.enumData.PaparazziRatingEnum;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long przSeq;

    private String przTitle;
    private String przContents;
    private int przLikeCount;
    private int przViewCount;

    private int przCmtCount;
    private PaparazziRatingEnum przRating;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private PaparazziCategory przCategory;

}
