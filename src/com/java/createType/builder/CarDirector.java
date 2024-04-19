package com.java.createType.builder;

/**
 * 汽车建造指挥者
 */
public class CarDirector {

    private CarBuilder carBuilder = null;

    public CarDirector() {

    }

    //构造器注入
    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    //set方法注入
    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    /**
     * 将汽车的组装过程交给指挥者来控制
     */
    public Car buildCar() {
        Engine engine = carBuilder.buildEngine();
        CarShell carShell = carBuilder.buildCarShell();
        System.out.println("将" + engine + "组装到" + carShell + "中");
        Tyre tyre = carBuilder.buildTyre();
        System.out.println("将" + tyre + "组装到" + carShell + "中");
        Car car = new Car();
        car.setEngine(engine);
        car.setCarShell(carShell);
        car.setTyre(tyre);
        return car;
    }
}
