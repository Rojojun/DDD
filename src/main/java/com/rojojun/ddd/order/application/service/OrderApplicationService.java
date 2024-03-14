package com.rojojun.ddd.order.application.service;

import com.rojojun.ddd.order.domain.entity.Order;
import com.rojojun.ddd.order.domain.service.OrderService;
import com.rojojun.ddd.order.domain.vo.OrderItem;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class OrderApplicationService {
    private final OrderService orderService;

    public Long placeOrder(List<OrderItem> items) {
        // 주문 생성 및 저장
        Order order = orderService.createOrder(items);
        return null;
    }
}

