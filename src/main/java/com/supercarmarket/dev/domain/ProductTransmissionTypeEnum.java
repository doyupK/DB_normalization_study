package com.supercarmarket.dev.domain;

public enum ProductTransmissionTypeEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductTransmissionTypeEnum(boolean code) {
        this.code = code;
    }
}
