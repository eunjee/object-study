package com.example.chapter2.src.discount;

import com.example.chapter2.src.Money;
import com.example.chapter2.src.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }
}
