package com.java.structuralType.bridging;

/**
 * 使用桥接模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        //使用海尔冰箱
        ElectricAppliance elcApp1 = new Refrigerator(new Haier());
        elcApp1.running();
        System.out.println("==========================");
        //使用格力空调
        ElectricAppliance elcApp2 = new Conditioner(new Gree());
        elcApp2.running();
    }
}
