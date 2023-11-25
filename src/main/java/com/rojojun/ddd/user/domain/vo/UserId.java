package com.rojojun.ddd.user.domain.vo;

public class UserId {
    private final String value;

    public UserId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("value가 null이거나 빈 문자열임");

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
