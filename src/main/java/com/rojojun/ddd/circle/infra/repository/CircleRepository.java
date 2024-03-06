package com.rojojun.ddd.circle.infra.repository;

import com.rojojun.ddd.circle.domain.entity.Circle;
import com.rojojun.ddd.circle.domain.vo.CircleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircleRepository extends JpaRepository<Circle, CircleId> {

}
