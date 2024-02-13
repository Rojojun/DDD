package com.rojojun.ddd.order.domain.service;

import com.rojojun.ddd.order.domain.entity.Order;
import com.rojojun.ddd.order.domain.vo.OrderItem;
import com.rojojun.ddd.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public Order createOrder(List<OrderItem> items) {
        // 주문 생성 로직
        Order order = new Order();
        order.setItems(items);
        order.setOrderDate(LocalDateTime.now());
        // 저장 로직
        return orderRepository.save(order);
    }}
