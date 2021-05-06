package com.tdd;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String toValue) {

        if (from.equals(toValue)) {
            return 1;
        }
        return rateMap.get(new Pair(from, toValue));
    }

    public void addRate(String from, String toValue, int rate) {
        rateMap.put(new Pair(from, toValue), rate);
    }
}
