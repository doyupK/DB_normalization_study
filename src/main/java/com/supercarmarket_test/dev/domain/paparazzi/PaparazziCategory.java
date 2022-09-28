package com.supercarmarket_test.dev.domain.paparazzi;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class PaparazziCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caSeq;

    private String caName;
}
