package com.supercarmarket.dev.domain;

public enum PaparazziRatingEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    PaparazziRatingEnum(boolean code) {
        this.code = code;
    }
}