package com.java.createType.builder;

/**
 * 高配汽车建造者
 */
public class HighCollocationCarBuilder implements CarBuilder {

    /**
     * 建造汽车外壳
     */
    @Override
    public CarShell buildCarShell() {
        System.out.println("给高配汽车的外壳添加优质的钢材");
        return new CarShell("高配汽车外壳");
    }

    /**
     * 建造发动机
     */
    @Override
    public Engine buildEngine() {
        return new Engine("高配汽车发动机");
    }

    /**
     * 建造轮胎
     */
    @Override
    public Tyre buildTyre() {
        return new Tyre("高配汽车轮胎");
    }
}
