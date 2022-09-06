package com.supercarmarket.dev.domain.enumData;

public enum UserRatingEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    UserRatingEnum(boolean code) {
        this.code = code;
    }
}