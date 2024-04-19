package com.java.createType.builder;

/**
 * 使用建造者模式实现的建造汽车客户端
 * 用建造者模式：将产品和产品的生产过程解耦，也就是拆分开，进行实现
 */
public class Client {

    public static void main(String[] args) {
        //生产标配汽车
        CarDirector carDirector = new CarDirector(new StandardCarBuilder());
        Car standardCar = carDirector.buildCar();
        System.out.println("得到的汽车是：" + standardCar);

        //生产高配汽车
        carDirector.setCarBuilder(new HighCollocationCarBuilder());
        Car highCollocationCar = carDirector.buildCar();
        System.out.println("得到的汽车是：" + highCollocationCar);
    }
}
