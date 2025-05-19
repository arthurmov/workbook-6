package com.pluralsight;

public class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public double getValue() {
        return balance;
    }
}
