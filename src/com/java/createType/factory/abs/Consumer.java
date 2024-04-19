package com.java.createType.factory.abs;


/**
 * 购买牙膏的消费者
 */
public class Consumer {

    public static void main(String[] args) {
        Shop shop = new Shop();
        String boughtToothbrushingUtil = shop.sellToothbrushUtils(new ZhongHuaFactory());
        System.out.println("消费者买到了" + boughtToothbrushingUtil);
        System.out.println("================");
        String boughtToothbrushingUtil2 = shop.sellToothbrushUtils(new GaoLuJieFactory());
        System.out.println("消费者买到了" + boughtToothbrushingUtil2);
    }
}
