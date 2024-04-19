package com.java.structuralType.adapterModel;

/**
 * USB接口适配器（相当于一个多功能USB转接头即Adapter）
 * 这种使用继承的方式就是类适配器模式
 */
public class USBAdapter extends ApplePhone implements USB {

    @Override
    public String provideUsbSomething() {
        return provideLightningSomething();
    }
}
