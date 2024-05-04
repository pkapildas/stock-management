package com.kmilanez.stockmanagement;

public class Wallet {

    private Double balance;

    public Wallet() {
        this.balance = 0d;
    }

    public Wallet(Double initialBalance) {
        this.balance = initialBalance;
    }

    public void addMoney(Double ammount) {
        this.balance += ammount;
    }

    public Double getBalance() {
        return this.balance;
    }
}
