package com.java.createType.builder;


/**
 * 汽车建造者接口
 */
public interface CarBuilder {
    //生产外壳
    CarShell buildCarShell();
    //生产发动机
    Engine buildEngine();
    //生产轮胎
    Tyre buildTyre();
}
