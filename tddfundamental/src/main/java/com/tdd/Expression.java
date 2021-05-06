package com.tdd;

public interface Expression {
    Money reduce(Bank bank, String toValue);
    public Expression plus(Expression addend);

   Expression times(int multiplier);

}
