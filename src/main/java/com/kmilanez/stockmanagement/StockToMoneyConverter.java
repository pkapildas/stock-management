package com.kmilanez.stockmanagement;

import java.util.List;

public class StockToMoneyConverter {
    
    public void convert(List<String> stocks, Wallet wallet) {
        for (String stock : stocks) {
            if (stock == StockNames.STOCK_A) {
                Double stockValue = StockValues.findStockValuesByStockName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_B) {
                Double stockValue = StockValues.findStockValuesByStockName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_C) {
                Double stockValue = StockValues.findStockValuesByStockName(stock);
                wallet.addMoney(stockValue.intValue());
            } else {
                wallet.addMoney(3);
            }
        }
    }

}
