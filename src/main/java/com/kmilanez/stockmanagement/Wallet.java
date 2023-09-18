package com.kmilanez.stockmanagement;

public class Wallet {

    private Integer balance;

    public Wallet() {
        this.balance = 0;
    }

    public Wallet(Integer initialBalance) {
        this.balance = initialBalance;
    }

    public void addMoney(Integer ammount) {
        this.balance += ammount;
    }

    public Integer getBalance() {
        return this.balance;
    }
}
