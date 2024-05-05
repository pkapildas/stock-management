package com.kmilanez.stockmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class StockToMoneyConverterTest {
    
    @Test
    void itShouldHaveABalanceOf2() {
        var converter = new StockToMoneyConverter();
        var wallet = new Wallet();

        converter.convert(List.of(StockNames.STOCK_B), wallet);
        
        assertEquals(2, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOf4() {
        var converter = new StockToMoneyConverter();
        var wallet = new Wallet();

        converter.convert(List.of(StockNames.STOCK_B, StockNames.STOCK_B), wallet);
        
        assertEquals(4, wallet.getBalance());
    }

    @Test
    void itShouldHaveABalanceOfOnePointOne() {
        var converter = new StockToMoneyConverter();
        var wallet = new Wallet();

        converter.convert(List.of(StockNames.STOCK_B), wallet);
        
        assertEquals(2.0, wallet.getBalance());
    }


    @Test
    void it_test_invalid_stock_name() {
        var converter = new StockToMoneyConverter();
        var wallet = new Wallet();

        converter.convert(List.of("STOCK_ADANI_X"), wallet);

        assertEquals(0.0, wallet.getBalance());
    }

    @Test
    void ut_test_invalid_stock_name() {
  StockValues.addStock("TPOWER", 100.0);
        Double tpower = StockValues.findStockValuesByStockName("TPOWER");

        assertEquals(100.0, tpower);
          tpower = StockValues.findStockValuesByStockName("TPOWER1");

        assertEquals(0.0, tpower);
    }
}
