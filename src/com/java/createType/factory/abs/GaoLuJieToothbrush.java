package com.java.createType.factory.abs;

/**
 * 高露洁牌牙刷
 */
public class GaoLuJieToothbrush extends Toothbrush {

    public GaoLuJieToothbrush() {
        this.brand = "高露洁牌";
    }

    @Override
    public void pack() {
        System.out.println("给" + brand + "牙刷进行了组装！");
    }
}
