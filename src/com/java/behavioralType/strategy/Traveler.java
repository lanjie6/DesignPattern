package com.java.behavioralType.strategy;

/**
 * 旅行者类
 */
public class Traveler {

    //持有一个旅行策略接口的实现类
    private TravelingStrategy travelingStrategy;

    public Traveler(TravelingStrategy travelingStrategy) {
        this.travelingStrategy = travelingStrategy;
    }

    public void goTraveling() {
        //省去了繁琐的if-- else if -- else if
        travelingStrategy.goTraveling();
    }
}
