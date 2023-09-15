package com.kmilanez.stockmanagement;

import java.util.ArrayList;
import java.util.List;

public class StockValues {
    
    private static final List<ValuePair<String, Double>> stockValues = new ArrayList<>();

    static {
        stockValues.add(new ValuePair<String, Double>("StockA", Double.valueOf(1.1)));
        stockValues.add(new ValuePair<String, Double>("StockB", Double.valueOf(2)));
        stockValues.add(new ValuePair<String, Double>("StockC", Double.valueOf(2.5)));
        stockValues.add(new ValuePair<String, Double>("StockD", Double.valueOf(-1.1)));
        stockValues.add(new ValuePair<String, Double>("StockE", Double.valueOf(-3)));
    }

    public static Double findStockValueByName(String stockName) {
        for (ValuePair<String, Double> stockValue : stockValues) {
            if (stockValue.getFirst() == stockName) {
                return stockValue.getSecond();
            }
        }
        return 0.0;
    }

}