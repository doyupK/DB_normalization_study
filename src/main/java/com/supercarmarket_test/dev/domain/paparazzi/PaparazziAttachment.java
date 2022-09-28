package com.supercarmarket_test.dev.domain.paparazzi;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class PaparazziAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pattSeq;

    private String pattAttachmentUrl;

    @ManyToOne
    @JoinColumn(name = "przSeq")
    private Paparazzi przSeq;


}
