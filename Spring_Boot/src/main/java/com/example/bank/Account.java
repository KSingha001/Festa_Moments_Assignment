package com.example.bank;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double balance;

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBalance(double balance) { this.balance = balance; }
}