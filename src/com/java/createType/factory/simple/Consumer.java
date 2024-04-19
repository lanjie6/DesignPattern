package com.java.createType.factory.simple;

/**
 * 购买牙膏的消费者
 */
public class Consumer {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Toothpaste boughtToothpaste1 = shop.sellToothpaste("中华牌");
        System.out.println("消费者买到了" + boughtToothpaste1);
        System.out.println("================");
        Toothpaste boughtToothpaste2 = shop.sellToothpaste("高露洁牌");
        System.out.println("消费者买到了" + boughtToothpaste2);
    }
}
