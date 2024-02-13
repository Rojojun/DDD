package com.rojojun.ddd.order.domain.entity;

import com.rojojun.ddd.order.domain.vo.OrderItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @ElementCollection
    // @CollectionTable 지정 필요
    private List<OrderItem> items;
    private LocalDateTime orderDate;
}
