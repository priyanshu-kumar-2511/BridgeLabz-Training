package com.collections.bankingsystem;

import java.util.*;

public class BankingSystem {

    private Map<String, Double> accounts = new HashMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        accounts.merge(accountNumber, amount, Double::sum);
    }

    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {

        while (!withdrawalQueue.isEmpty()) {

            WithdrawalRequest request = withdrawalQueue.poll();
            String acc = request.getAccountNumber();
            double amount = request.getAmount();

            if (!accounts.containsKey(acc)) {
                System.out.println("Account not found: " + acc);
                continue;
            }

            double balance = accounts.get(acc);

            if (balance >= amount) {
                accounts.put(acc, balance - amount);
                System.out.println("Withdrawal successful for " + acc);
            } else {
                System.out.println("Insufficient funds for " + acc);
            }
        }
    }

    public void displaySortedByBalance() {

        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> entry : accounts.entrySet()) {

            sorted
                .computeIfAbsent(entry.getValue(), b -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("Accounts Sorted by Balance:");

        for (Map.Entry<Double, List<String>> entry : sorted.entrySet()) {
            for (String acc : entry.getValue()) {
                System.out.println(acc + " : " + entry.getKey());
            }
        }
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        accounts.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
