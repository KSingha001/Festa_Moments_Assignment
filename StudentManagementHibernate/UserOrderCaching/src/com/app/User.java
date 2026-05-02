package com.app;

import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Order> orders;

    public User(int id, String name, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}