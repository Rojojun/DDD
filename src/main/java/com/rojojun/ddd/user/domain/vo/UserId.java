package com.rojojun.ddd.user.domain.vo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;

@Embeddable
@Getter
public class UserId {
    private String id;
}
