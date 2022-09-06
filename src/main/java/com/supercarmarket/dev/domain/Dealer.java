package com.supercarmarket.dev.domain;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Dealer {
    @Id
    @GeneratedValue()
    Long seq;

    @OneToOne
    @JoinColumn
    User user;


    String name;
    String dealerNumber;
    String affiliation;
    String address;


}
