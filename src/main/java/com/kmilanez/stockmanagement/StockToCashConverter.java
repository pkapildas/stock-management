package com.kmilanez.stockmanagement;

import java.util.List;

public class StockToCashConverter {
    
    public void convert(List<String> stocks, Wallet wallet) {
        for (String stock : stocks) {
            if (stock == StockNames.STOCK_A) {
                Double stockValue = StockValues.findStockValueByName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_B) {
                Double stockValue = StockValues.findStockValueByName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_C) {
                Double stockValue = StockValues.findStockValueByName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_D) {
                Double stockValue = StockValues.findStockValueByName(stock);
                wallet.addMoney(stockValue.intValue());
            } else if (stock == StockNames.STOCK_E) {
                Double stockValue = StockValues.findStockValueByName(stock);
                wallet.addMoney(stockValue.intValue());
            } else {
                wallet.addMoney(3);
            }
        }
    }

}
