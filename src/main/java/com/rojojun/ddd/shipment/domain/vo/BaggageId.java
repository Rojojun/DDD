package com.rojojun.ddd.shipment.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Embeddable
public class BaggageId {
    private String value;

    public BaggageId(String value) {
        this.value = value;
    }
}
