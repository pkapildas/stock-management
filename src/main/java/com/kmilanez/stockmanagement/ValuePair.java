package com.kmilanez.stockmanagement;

public class ValuePair<T, U> {

    private final T first;
    private final U second;

    public ValuePair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

}
