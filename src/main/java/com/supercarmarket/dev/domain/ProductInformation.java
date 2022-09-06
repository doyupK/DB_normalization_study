package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.enumData.ProductFuelTypeEnum;
import com.supercarmarket.dev.domain.enumData.ProductTransmissionTypeEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class ProductInformation {

    @Id
    @GeneratedValue
    Long seq;

    @OneToOne
    Product product;
    String carNumber;
    String registrationDate; // 최초 자동차등록일
    String displacement;
    ProductTransmissionTypeEnum productTransmissionTypeEnum;
    int mileage;
    String color;
    boolean accidentHistory;
    ProductFuelTypeEnum productFuelType;
}
