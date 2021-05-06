package com.tdd;

import java.util.Objects;

public class Pair {

    private final String from;
    private final String toValue;

    public Pair(String from, String toValue) {
        this.from = from;
        this.toValue = toValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return Objects.equals(from, pair.from) && Objects.equals(toValue, pair.toValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, toValue);
    }
}
