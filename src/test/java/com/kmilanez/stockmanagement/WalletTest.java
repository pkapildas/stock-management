package com.kmilanez.stockmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

class WalletTest {

    @Test
    void itShouldHaveABalanceOf1() {
        var wallet = new Wallet();
        wallet.addMoney(1d);
        assertEquals(1, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf5() {
        var wallet = new Wallet();
        wallet.addMoney(5d);
        assertEquals(5, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf6() {
        var wallet = new Wallet();
        wallet.addMoney(2d);
        wallet.addMoney(2d);
        wallet.addMoney(2d);
        assertEquals(6, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf6Point3() {
        var wallet = new Wallet();
        wallet.addMoney(2.1);
        wallet.addMoney(2.1);
        wallet.addMoney(2.1);
        DecimalFormat df=new DecimalFormat("0.0");
        String formate = df.format(wallet.getBalance());
        assertEquals("6.3",formate);
    }

}
