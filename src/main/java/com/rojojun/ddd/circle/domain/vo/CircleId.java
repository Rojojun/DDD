package com.rojojun.ddd.circle.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@Embeddable
public class CircleId implements Serializable {
    private Long id;

    public CircleId(Long value) {
        if (value == null) throw new NullPointerException("value가 null입니다.");

        this.id = value;
    }
}
