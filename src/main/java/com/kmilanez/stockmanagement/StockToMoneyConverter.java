package com.kmilanez.stockmanagement;

import java.util.List;

public class StockToMoneyConverter {
    
    public void convert(List<String> stocks, Wallet wallet) {
        for (String stock : stocks) {
                Double stockValue = StockValues.findStockValuesByStockName(stock);
                wallet.addMoney(stockValue);

        }
    }

}
