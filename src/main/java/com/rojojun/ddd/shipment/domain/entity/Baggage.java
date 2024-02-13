package com.rojojun.ddd.shipment.domain.entity;

import com.rojojun.ddd.shipment.domain.vo.BaggageId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Baggage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Embedded
    private BaggageId baggageId;
}
