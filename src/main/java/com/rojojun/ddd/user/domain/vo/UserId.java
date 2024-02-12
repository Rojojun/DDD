package com.rojojun.ddd.user.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Embeddable
public class UserId {
    private String id;

    public UserId(String value) {
        if(value == null) throw new IllegalArgumentException("value는 null이면 안됩니다.");

        this.id = value;
    }
}
