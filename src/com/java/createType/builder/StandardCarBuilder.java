package com.java.createType.builder;

/**
 * 标配汽车建造者
 */
public class StandardCarBuilder implements CarBuilder {

    /**
     * 建造汽车外壳
     */
    @Override
    public CarShell buildCarShell() {
        return new CarShell("标配汽车外壳");
    }

    /**
     * 建造发动机
     */
    @Override
    public Engine buildEngine() {
        return new Engine("标配汽车发动机");
    }

    /**
     * 建造轮胎
     */
    @Override
    public Tyre buildTyre() {
        return new Tyre("标配汽车轮胎");
    }
}
