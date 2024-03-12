package com.rojojun.ddd.circle.infra.repository;

import com.rojojun.ddd.circle.domain.entity.Circle;
import com.rojojun.ddd.circle.domain.vo.CircleId;
import com.rojojun.ddd.common.annotation.DomainService;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainService
public interface CircleRepository extends JpaRepository<Circle, CircleId> {

}
