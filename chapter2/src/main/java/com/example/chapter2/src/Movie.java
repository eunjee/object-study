package com.example.chapter2.src;

import com.example.chapter2.src.discount.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    //Movie 클래스는 어떤 할인 정책을 사용하는지 모른다. 할인 정책 방식에 상관없이 메시지를 전달함
    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening){
//        if(discountPolicy==null){ // 문제점 - 일관성 있는 협력방식이 무너짐
//            return fee;
//        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
