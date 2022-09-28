package com.supercarmarket_test.dev.domain.magazine;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class MagazineAttachment {
    @Id
    @GeneratedValue
    private Long mattSeq;

    private String mattAttachmentUrl;

    @ManyToOne
    @JoinColumn(name = "mgzSeq")
    private Magazine mgzSeq;


}
