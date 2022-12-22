package com.tomspencerlondon.applyingfunctionalprogramming.applying;

public class Order {
    public final OrderStatus orderStatus;
    public final Integer orderRewards;

    public Order(OrderStatus orderStatus, Integer orderRewards) {
        this.orderStatus = orderStatus;
        this.orderRewards = orderRewards;
    }
}
