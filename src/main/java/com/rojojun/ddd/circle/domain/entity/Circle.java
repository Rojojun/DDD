package com.rojojun.ddd.circle.domain.entity;

import com.rojojun.ddd.circle.domain.vo.CircleId;
import com.rojojun.ddd.circle.domain.vo.CircleName;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Circle {
    @EmbeddedId
    private CircleId id;
    @Embedded
    private CircleName name;

    public Circle(CircleId id, CircleName name) {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        if (name == null) throw new IllegalArgumentException("name cannot be null");
//        if (owner == null) throw new IllegalArgumentException("owner cannot be null");
//        if (members == null) throw new IllegalArgumentException("members cannot be null");

        this.id = id;
        this.name = name;
    }
}
