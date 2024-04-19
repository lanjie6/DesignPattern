package com.java.createType.factory.method;


/**
 * 购买牙膏的消费者
 */
public class Consumer {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Toothpaste boughtToothpaste1 = shop.sellToothpaste(new ZhongHuaFactory());
        System.out.println("消费者买到了" + boughtToothpaste1);
        System.out.println("================");
        Toothpaste boughtToothpaste2 = shop.sellToothpaste(new GaoLuJieFactory());
        System.out.println("消费者买到了" + boughtToothpaste2);
    }
}
