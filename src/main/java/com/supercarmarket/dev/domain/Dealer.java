package com.supercarmarket.dev.domain;

import javax.persistence.*;

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
