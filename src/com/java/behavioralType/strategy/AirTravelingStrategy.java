package com.java.behavioralType.strategy;

/**
 * 飞机旅行策略实现类
 */
public class AirTravelingStrategy implements TravelingStrategy {

    @Override
    public void goTraveling() {
        System.out.println("乘坐飞机去旅行……");
    }
}
