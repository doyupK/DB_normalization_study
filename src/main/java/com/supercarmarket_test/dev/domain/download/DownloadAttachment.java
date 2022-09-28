package com.supercarmarket_test.dev.domain.download;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class DownloadAttachment {
    @Id
    @GeneratedValue
    private Long dattSeq;

    private String dattAttachmentUrl;

    @ManyToOne
    @JoinColumn(name = "dwlSeq")
    private Download dwlSeq;


}
