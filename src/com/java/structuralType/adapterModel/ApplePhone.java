package com.java.structuralType.adapterModel;

/**
 * 苹果手机（相当于需要适配的类即Adaptee）
 */
public class ApplePhone implements Lightning {

    @Override
    public String provideLightningSomething() {
        return "提供苹果手机相关功能";
    }
}
