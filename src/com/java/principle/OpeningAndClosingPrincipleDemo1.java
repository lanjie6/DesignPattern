package com.java.principle;

/**
 * 开闭原则-反例
 */
public class OpeningAndClosingPrincipleDemo1 {

    public static void main(String[] args) {
        //创建机动车生产者类对象
        MotorVehicleProduction mvp = new MotorVehicleProduction();
        //生产一辆大巴车
        mvp.product(new Bus());
        //生产一辆小轿车
        mvp.product(new SedanCar());
        //生产一辆拖拉机
        mvp.product(new Tractor());
        //生产一辆中巴车
        mvp.product(new MiddleBus());
    }
}

/**
 * 机动车生产者类（使用方）
 */
class MotorVehicleProduction {

    /**
     * 接收一个机动车对象，然后根据类型去决定生产哪种具体的机动车
     */
    public void product(MotorVehicle mv) {
        if (mv.type == 1) {
            productBus(mv);
        } else if (mv.type == 2) {
            productSedanCar(mv);
        } else if (mv.type == 3) {
            productTractor(mv);
        } else if (mv.type == 4) {
            productMiddleBus(mv);
        }

    }

    /**
     * 生产大巴车
     */
    public void productBus(MotorVehicle mv) {
        System.out.println("生产" + mv.name + "……");
    }

    /**
     * 生产小轿车
     */
    public void productSedanCar(MotorVehicle mv) {
        System.out.println("生产" + mv.name + "……");
    }


    /**
     * 生产拖拉机
     */
    public void productTractor(MotorVehicle mv) {
        System.out.println("生产" + mv.name + "……");
    }

    /**
     * 生产中巴车
     */
    public void productMiddleBus(MotorVehicle mv) {
        System.out.println("生产" + mv.name + "……");
    }


}

/**
 * 机动车类
 */
class MotorVehicle {

    protected int type;

    protected String name;
}

/**
 * 大巴车类
 */
class Bus extends MotorVehicle {

    Bus() {
        super.type = 1;
        super.name = "大巴车";
    }
}

/**
 * 小轿车类
 */
class SedanCar extends MotorVehicle {

    SedanCar() {
        super.type = 2;
        super.name = "小轿车";
    }
}

/**
 * 拖拉机类
 */
class Tractor extends MotorVehicle {

    Tractor() {
        super.type = 3;
        super.name = "拖拉机";
    }
}

/**
 * 中巴车类
 */
class MiddleBus extends MotorVehicle {

    MiddleBus() {
        super.type = 4;
        super.name = "中巴车";
    }
}
