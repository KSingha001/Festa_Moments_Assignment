package com.example.bank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bank.Account;
import com.example.bank.AccountRepository;

@Service
public class BankService {

    @Autowired
    private AccountRepository repo;

    public Account createAccount(Account acc) {
        return repo.save(acc);
    }

    public Account getAccount(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    // 🔥 TRANSACTION METHOD
    @Transactional
    public void transferMoney(int from, int to, double amount) {

        Account sender = repo.findById(from)
                .orElseThrow();

        Account receiver = repo.findById(to)
                .orElseThrow();

        // Deduct money
        if (sender.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        sender.setBalance(sender.getBalance() - amount);
        repo.save(sender);

        // 🔥 Simulate failure (for testing rollback)
        if (amount > 10000) {
            throw new RuntimeException("Transaction failed intentionally!");
        }

        // Add money
        receiver.setBalance(receiver.getBalance() + amount);
        repo.save(receiver);
    }
}
