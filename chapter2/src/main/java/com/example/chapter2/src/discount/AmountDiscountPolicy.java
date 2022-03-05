package com.example.chapter2.src.discount;

import com.example.chapter2.src.Money;
import com.example.chapter2.src.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount,DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
