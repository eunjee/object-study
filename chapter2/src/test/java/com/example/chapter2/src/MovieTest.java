package com.example.chapter2.src;

import com.example.chapter2.src.discount.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Movie 클래스")
class MovieTest {
    Movie given_아바타() {
        return new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                given_아바타_할인정책());
    }
    private DiscountPolicy given_아바타_할인정책() {
        return new AmountDiscountPolicy(Money.wons(800),
                new SequenceCondition(1),
                new SequenceCondition(10),
                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0),LocalTime.of(11,59)),
                new PeriodCondition(DayOfWeek.THURSDAY,LocalTime.of(10,0),LocalTime.of(20,59)));
    }

    Movie given_타이타닉() {
        return new Movie(
                "타이타닉",
                Duration.ofMinutes(180),
                Money.wons(11000),
                given_타이타닉_할인정책);
    }

    private final DiscountPolicy given_타이타닉_할인정책 = new PercentDiscountPolicy(0.1,
            new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
            new SequenceCondition(2),
            new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59)));

    Movie given_스타워즈() {
        return new Movie(
                "스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                given_스타워즈_할인정책());
    }

    private DiscountPolicy given_스타워즈_할인정책(){new NoneDiscountPolicy();}

}