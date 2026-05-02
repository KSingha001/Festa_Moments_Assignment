package com.app;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserService();

        // First call (DB)
        User user1 = service.getUser(1);
        printUser(user1);

        // Second call (Cache)
        User user2 = service.getUser(1);
        printUser(user2);
    }

    public static void printUser(User user) {
        System.out.println("User: " + user.getName());

        System.out.print("Orders: ");
        for (Order o : user.getOrders()) {
            System.out.print(o.getProductName() + " ");
        }
        System.out.println("\n");
    }
}