package com.keyin.account;

public class Account {
    private int id;
    private double amount;

    public Account(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return amount;
    }

    public void setBalance(double amount) {
        this.amount = amount;
    }
}
