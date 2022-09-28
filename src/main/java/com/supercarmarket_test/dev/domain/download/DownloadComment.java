package com.supercarmarket_test.dev.domain.download;

import com.supercarmarket_test.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class DownloadComment {
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
    @JoinColumn(name = "dwlSeq")
    private Download dwlSeq;


}
