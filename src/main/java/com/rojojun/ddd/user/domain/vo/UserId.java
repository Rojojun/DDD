package com.rojojun.ddd.user.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class UserId {
    private String id;
}
