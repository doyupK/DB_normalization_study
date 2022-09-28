package com.supercarmarket_test.dev.domain.magazine;

import com.supercarmarket_test.dev.domain.user.User;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(
            name = "message-id-generator",
            strategy = "sequence",
            parameters = {
                    Parameter(name = "SequenceStyleGenerator.SEQUENCE_PARAM, value = "hibernate_sequence")
            }

    )
    private Long mgzSeq;

    private String mgzTitle;
    private String mgzBannerImageUrl;
    private String mgzContents;

    @ManyToOne
    @JoinColumn(name = "userSeq")
    private User userSeq;


}
