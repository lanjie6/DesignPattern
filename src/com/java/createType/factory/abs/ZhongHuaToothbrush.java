package com.java.createType.factory.abs;

/**
 * 中华牌牙刷
 */
public class ZhongHuaToothbrush extends Toothbrush {

    public ZhongHuaToothbrush() {
        this.brand = "中华牌";
    }

    @Override
    public void pack() {
        System.out.println("给" + brand + "牙刷进行了组装！");
    }
}
