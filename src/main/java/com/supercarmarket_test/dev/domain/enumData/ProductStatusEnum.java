package com.supercarmarket_test.dev.domain.enumData;

public enum ProductStatusEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductStatusEnum(boolean code) {
        this.code = code;
    }
}
