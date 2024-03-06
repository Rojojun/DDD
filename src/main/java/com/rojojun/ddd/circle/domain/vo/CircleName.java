package com.rojojun.ddd.circle.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class CircleName implements Comparable<CircleName>{
    private String value;

    public CircleName(String value) {
        if (value == null) throw new IllegalArgumentException("value cannot be null");
        if (value.length() < 3) throw new IllegalArgumentException("Circle name must be at least 3 characters long");
        if (value.length() > 20) throw new IllegalArgumentException("Circle name must be at most 20 characters long");

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(CircleName o) {
        return value.compareTo(o.value);
    }
}
