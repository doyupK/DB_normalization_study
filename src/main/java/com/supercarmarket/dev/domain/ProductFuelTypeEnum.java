package com.supercarmarket.dev.domain;

public enum ProductFuelTypeEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductFuelTypeEnum(boolean code) {
        this.code = code;
    }
}
