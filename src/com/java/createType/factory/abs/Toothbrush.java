package com.java.createType.factory.abs;

/**
 * 牙刷抽象类
 */
public abstract class Toothbrush {

    protected String brand;

    public void createHair() {
        System.out.println("产生了" + brand + "的牙刷毛");
    }

    public void createHandle() {
        System.out.println("产生了" + brand + "的手柄");
    }

    public abstract void pack();

    @Override
    public String toString() {
        return brand + "的牙刷";
    }
}
