package com.rojojun.ddd.user.domain.entity;

import com.rojojun.ddd.user.domain.vo.UserId;
import com.rojojun.ddd.user.domain.vo.UserName;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Embedded
    private UserId userId;
    @Embedded
    private UserName name;

    public User(UserName name) {
        if (name == null) throw new NullPointerException("Name은 null이 될 수 없습니다.");
        this.name = name;
    }

    public User(UserId userId, UserName name) {
        this.userId = userId;
        this.name = name;
    }


    public UserId getId() {
        return userId;
    }

    public UserName getName() {
        return name;
    }
}
