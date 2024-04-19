package com.java.createType.factory.method;


/**
 * 用于生产牙膏的工厂
 * 将简单工厂模式中的工厂类换成一个抽象类或者接口
 * 并提供一个用户创建对象的抽象方法，也就是将创建对象
 * 的过程下沉到实现类或者子类去实现。
 */
public interface ToothpasteFactory {

    /**
     * 创建牙膏方法（这个方法就是工厂方法）
     *
     * @return
     */
    Toothpaste createToothpaste();
}
