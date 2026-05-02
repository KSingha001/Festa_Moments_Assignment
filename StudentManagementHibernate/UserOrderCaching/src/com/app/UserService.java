package com.app;

import java.util.*;

public class UserService {

    // Cache
    private Map<Integer, User> cache = new HashMap<>();

    public User getUser(int id) {

        // Check cache
        if (cache.containsKey(id)) {
            System.out.println("Fetching from Cache");
            return cache.get(id);
        }

        // Simulate DB fetch
        System.out.println("Fetching from Database");

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Mobile"));
        orders.add(new Order(2, "Laptop"));

        User user = new User(id, "Yash", orders);

        // Store in cache
        cache.put(id, user);

        return user;
    }
}