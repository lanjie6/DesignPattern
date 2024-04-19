package com.java.createType.builder;

/**
 * 汽车
 */
public class Car {

    //汽车外壳
    private CarShell carShell;

    //汽车发动机
    private Engine engine;

    //汽车轮胎
    private Tyre tyre;

    public CarShell getCarShell() {
        return carShell;
    }

    public void setCarShell(CarShell carShell) {
        this.carShell = carShell;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car：" + carShell + "+" + engine + "+" + tyre;
    }

}
