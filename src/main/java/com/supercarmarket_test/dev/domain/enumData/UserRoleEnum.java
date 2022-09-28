package com.supercarmarket_test.dev.domain.enumData;

public enum UserRoleEnum {
    NORMAL(false),
    DEALER(true);

    final boolean type;

    UserRoleEnum(boolean type) {
        this.type = type;
    }
}