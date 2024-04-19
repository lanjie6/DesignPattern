package com.java.behavioralType.interpreter;

/**
 * 使用解释器模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("成都的老人");
        bus.freeRide("成都的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("北京的儿童");
    }
}
