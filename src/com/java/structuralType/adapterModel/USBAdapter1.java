package com.java.structuralType.adapterModel;

/**
 * USB接口适配器（相当于一个多功能USB转接线）
 * 这种使用组合的方式就是对象适配器模式
 */
public class USBAdapter1 implements USB {

    private ApplePhone applePhone;

    public USBAdapter1(ApplePhone applePhone) {
        this.applePhone = applePhone;
    }

    @Override
    public String provideUsbSomething() {
        return applePhone.provideLightningSomething();
    }
}
