package com.java.principle;

/**
 * 开闭原则-正例
 */
public class OpeningAndClosingPrincipleDemo2 {

    public static void main(String[] args) {
        //创建机动车生产者类对象
        MotorVehicleProduction1 mvp = new MotorVehicleProduction1();
        //生产一辆大巴车
        mvp.product(new Bus1());
        //生产一辆小轿车
        mvp.product(new SedanCar1());
        //生产一辆拖拉机
        mvp.product(new Tractor1());
        //生产一辆中巴车
        mvp.product(new MiddleBus1());
    }
}

/**
 * 机动车生产者类（使用方）
 */
class MotorVehicleProduction1 {

    public void product(MotorVehicle1 mv) {
        /*
         *1、避免在类中使用else if……
         *2、避免增加新功能和需求有变更的时候去修改源代码
         */
        mv.product();
    }

}

/**
 * 机动车类
 */
abstract class MotorVehicle1 {

    protected int type;

    protected String name;

    /**
     * 抽象方法
     */
    protected abstract void product();

}

/**
 * 大巴车类
 */
class Bus1 extends MotorVehicle1 {

    Bus1() {
        super.type = 1;
        super.name = "大巴车";
    }

    @Override
    protected void product() {
        System.out.println("生产" + this.name + "……");

    }
}

/**
 * 小轿车类
 */
class SedanCar1 extends MotorVehicle1 {

    SedanCar1() {
        super.type = 2;
        super.name = "小轿车";
    }

    @Override
    protected void product() {
        System.out.println("生产" + this.name + "……");

    }
}

/**
 * 拖拉机类
 */
class Tractor1 extends MotorVehicle1 {

    Tractor1() {
        super.type = 3;
        super.name = "拖拉机";
    }

    @Override
    protected void product() {
        System.out.println("生产" + this.name + "……");

    }
}

/**
 * 中巴车类
 */
class MiddleBus1 extends MotorVehicle1 {

    MiddleBus1() {
        super.type = 4;
        super.name = "中巴车";
    }

    @Override
    protected void product() {
        System.out.println("生产" + this.name + "……");

    }
}
