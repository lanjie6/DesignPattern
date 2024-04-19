package com.java.createType.factory.simple;

/**
 * 中华牌牙膏
 */
public class ZhongHuaToothpaste extends Toothpaste {

    public ZhongHuaToothpaste() {
        this.brand = "中华牌";
    }

    @Override
    public void pack() {
        System.out.println("给" + brand + "牙膏进行了包装！");
    }
}
