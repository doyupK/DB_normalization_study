package com.supercarmarket.dev.domain;

public enum ProductRatingEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductRatingEnum(boolean code) {
        this.code = code;
    }
}
