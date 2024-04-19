package com.java.createType.factory.abs;

/**
 * 用于生产刷牙工具的工厂
 * 工厂方法模式产生的产品都是一个类或接口的子类实例，
 * 抽象工厂模式产生的产品是多个接口或抽象类的子类实例。
 */
public interface ToothBrushingFactory {

    /**
     * 创建牙膏方法
     *
     * @return
     */
    Toothpaste createToothpaste();

    /**
     * 创建牙刷方法
     *
     * @return
     */
    Toothbrush createToothbrush();
}
