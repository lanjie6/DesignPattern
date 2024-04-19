package com.java.createType.factory.simple;

/**
 * 高露洁牌牙膏
 */
public class GaoLuJieToothpaste extends Toothpaste {

    public GaoLuJieToothpaste() {
        this.brand = "高露洁牌";
    }

    @Override
    public void pack() {
        System.out.println("给" + brand + "牙膏进行了包装！");
    }
}
