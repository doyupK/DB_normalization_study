package com.supercarmarket_test.dev.domain.magazine;

import com.supercarmarket_test.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class MagazineComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cmtSeq;

    private Long likeCount;
    private String cmtContent;
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "userSeq")
    private User userSeq;

    @ManyToOne
    @JoinColumn(name = "mgzSeq")
    private Magazine mgzSeq;
}
