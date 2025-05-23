package com.mark.functionalprogramming.optional;

import com.mark.functionalprogramming.optional.model.Delivery;
import com.mark.functionalprogramming.optional.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
public class DeliveryTest {

    Map<Long, Order> orderRepository = new HashMap<>();

    @BeforeEach
    void init() {
        orderRepository.put(1L, new Order(1L, new Delivery("배송완료", false)));
        orderRepository.put(2L, new Order(2L, new Delivery("배송중", false)));
        orderRepository.put(3L, new Order(3L, new Delivery("배송중", true)));
        orderRepository.put(4L, new Order(4L, null));
    }

    @Test
    void test() {
        log.info("1 = {}", getDeliveryStatus(1L));
        log.info("2 = {}", getDeliveryStatus(2L));
        log.info("3 = {}", getDeliveryStatus(3L));
        log.info("4 = {}", getDeliveryStatus(4L));
    }

    private String getDeliveryStatus(long orderId) {
        return findOrder(orderId)
                .map(Order::getDelivery)
                .filter(delivery -> !delivery.isCanceled())
                .map(Delivery::getStatus)
                .orElse("배송 X");
    }

    Optional<Order> findOrder(Long orderId) {
        return Optional.ofNullable(orderRepository.get(orderId));
    }
}
