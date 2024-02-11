package com.rojojun.ddd.user.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Embeddable
public class UserName {
    private String value;

    public UserName(String value) {
        if (value == null) throw new ArithmeticException("value");
        if (value.length() < 3) throw new IllegalArgumentException("사용자명은 3글자 이상이여야합니다.");
        if (value.length() > 20 )throw new IllegalArgumentException("사용자명은 20글자 이하여야합니다.");

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
