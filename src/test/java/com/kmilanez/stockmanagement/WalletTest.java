package com.kmilanez.stockmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WalletTest {

    @Test
    void itShouldHaveABalanceOf1() {
        var wallet = new Wallet();
        wallet.addMoney(1);
        assertEquals(1, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf5() {
        var wallet = new Wallet();
        wallet.addMoney(5);
        assertEquals(5, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf6() {
        var wallet = new Wallet();
        wallet.addMoney(2);
        wallet.addMoney(2);
        wallet.addMoney(2);
        assertEquals(6, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf6Point3() {
        var wallet = new Wallet();
        wallet.addMoney(2.1);
        wallet.addMoney(2.1);
        wallet.addMoney(2.1);
        assertEquals(6.3, wallet.getBalance());
    }

}
