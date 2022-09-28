package com.supercarmarket_test.dev.domain.download;

import com.supercarmarket_test.dev.domain.TimeStamped;
import com.supercarmarket_test.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Download extends TimeStamped {
    @Id
    @GeneratedValue
    private Long dwlSeq;

    private String dwlTitle;
    private String dwlContents;
    private Long dwlLikeCount;
    private int dwlViewCount;
    private Long dwlCmtCount;

    String attachmentUrl;
    @ManyToOne
    private User user;
}
