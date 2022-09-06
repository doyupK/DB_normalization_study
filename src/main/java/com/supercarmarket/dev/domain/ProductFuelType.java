package com.supercarmarket.dev.domain;

public enum ProductFuelType {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductFuelType(boolean code) {
        this.code = code;
    }
}
