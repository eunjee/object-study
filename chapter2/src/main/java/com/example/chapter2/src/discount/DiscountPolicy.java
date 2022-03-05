package com.example.chapter2.src.discount;

import com.example.chapter2.src.Money;
import com.example.chapter2.src.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
