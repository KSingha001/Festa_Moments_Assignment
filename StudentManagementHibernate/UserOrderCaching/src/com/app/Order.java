package com.app;

public class Order {
    private int orderId;
    private String productName;

    public Order(int orderId, String productName) {
        this.orderId = orderId;
        this.productName = productName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }
}