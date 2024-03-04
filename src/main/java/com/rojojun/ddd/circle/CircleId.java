package com.rojojun.ddd.circle;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class CircleId {
    private String value;

    public String getValue() {
        return value;
    }

    public CircleId(String value) {
        if (value == null) throw new NullPointerException("value가 null입니다.");

        this.value = value;
    }
}
