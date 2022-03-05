package com.example.chapter2.src.discount;

import com.example.chapter2.src.Money;
import com.example.chapter2.src.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
