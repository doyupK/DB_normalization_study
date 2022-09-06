package com.supercarmarket.dev.domain;

public enum PartnerInquiryStatusEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    PartnerInquiryStatusEnum(boolean code) {
        this.code = code;
    }
}

