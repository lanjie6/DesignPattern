package com.java.behavioralType.strategy;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        Traveler traveler = new Traveler(new HightTrainTravelingStrategy());

        traveler.goTraveling();
    }
}
