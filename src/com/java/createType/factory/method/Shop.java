package com.java.createType.factory.method;


/**
 * 商店类用于用户消费者购买牙膏
 */
public class Shop {

    /**
     * 卖牙膏方法
     *
     * @param toothpasteFactory 牙膏品牌工厂
     * @return 牙膏对象
     */
    public Toothpaste sellToothpaste(ToothpasteFactory toothpasteFactory) {

        return toothpasteFactory.createToothpaste();
    }
}
