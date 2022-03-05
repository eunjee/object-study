package com.example.chapter2.src;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    //클래스 내부와 외부를 구분하는 이유 - 경계의 명확성이 객체의 자율성을 보장한다.

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence==sequence;
    }
    public Money getMovieFee(){
        return movie.getFee();
    }
    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer,this,calculateFee(audienceCount),audienceCount);
    }

    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
