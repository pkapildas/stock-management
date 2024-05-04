package com.kmilanez.stockmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StockValues {
    
    private static final Map<String, Double> stocks = new ConcurrentHashMap<>();

    static {
        stocks.put("StockA", Double.valueOf(1.1));
        stocks.put("StockB", Double.valueOf(2));
        stocks.put("StockC", Double.valueOf(2.5));
        stocks.put("StockD", Double.valueOf(-1.1));
        stocks.put("StockE", Double.valueOf(-3));
    }

    public static void addStock(String stock, Double  stockVal) {
        stocks.put(stock,stockVal);
    }

    public static Double findStockValuesByStockName(String stockName) {
         return stocks.getOrDefault(stockName, 0.0);
    }

}