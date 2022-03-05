package com.example.chapter2.src.discount;

import com.example.chapter2.src.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

}
