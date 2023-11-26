package com.rojojun.ddd.user.domain.entity;

import com.rojojun.ddd.user.domain.vo.UserId;
import com.rojojun.ddd.user.domain.vo.UserName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {
    @Id
    private final UserId id;
    private final UserName name;

    public User(UserName name) {
        if (name == null) throw new NullPointerException("Name은 null이 될 수 없습니다.");

        this.id = new UserId(UUID.randomUUID().toString());
        this.name = name;
    }

    public User(UserId id, UserName name) {

        this.id = id;
        this.name = name;
    }


    public UserId getId() {
        return id;
    }

    public UserName getName() {
        return name;
    }
}
