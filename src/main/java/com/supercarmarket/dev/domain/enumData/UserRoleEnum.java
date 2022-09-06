package com.supercarmarket.dev.domain.enumData;

public enum UserRoleEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    UserRoleEnum(boolean code) {
        this.code = code;
    }
}