package com.kmilanez.stockmanagement;

import java.util.ArrayList;
import java.util.List;

public class StockValues {
    
    private static final List<ValuePair<String, Double>> stocks = new ArrayList<>();

    static {
        stocks.add(new ValuePair<String, Double>("StockA", Double.valueOf(1.1)));
        stocks.add(new ValuePair<String, Double>("StockB", Double.valueOf(2)));
        stocks.add(new ValuePair<String, Double>("StockC", Double.valueOf(2.5)));
        stocks.add(new ValuePair<String, Double>("StockD", Double.valueOf(-1.1)));
        stocks.add(new ValuePair<String, Double>("StockE", Double.valueOf(-3)));
    }

    public static void addStock(ValuePair<String, Double> stock) {
        stocks.add(stock);
    }

    public static Double findStockValuesByStockName(String stockName) {
        for (ValuePair<String, Double> stockValue : stocks) {
            if (stockValue.getFirst() == stockName) {
                return stockValue.getSecond();
            }
        }
        return 0.0;
    }

}