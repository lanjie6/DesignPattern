package com.java.behavioralType.strategy;

/**
 * 高铁旅行策略实现类
 */
public class HightTrainTravelingStrategy implements TravelingStrategy {

    @Override
    public void goTraveling() {
        System.out.println("乘坐高铁去旅行……");
    }
}
