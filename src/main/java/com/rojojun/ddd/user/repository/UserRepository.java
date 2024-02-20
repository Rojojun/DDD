package com.rojojun.ddd.user.repository;

import com.rojojun.ddd.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
