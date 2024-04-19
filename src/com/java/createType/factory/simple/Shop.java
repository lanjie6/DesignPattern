package com.java.createType.factory.simple;

/**
 * 商店类用于用户消费者购买牙膏
 */
public class Shop {

    /**
     * 卖牙膏方法
     *
     * @param brand 牙膏品牌
     * @return 牙膏对象
     */
    public Toothpaste sellToothpaste(String brand) {
        return SimpleFactory.createToothpaste(brand);
    }
}
