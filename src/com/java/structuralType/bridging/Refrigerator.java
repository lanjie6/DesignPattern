package com.java.structuralType.bridging;

/**
 * 冰箱类（相当于扩展抽象角色）
 */
public class Refrigerator extends ElectricAppliance {

    public Refrigerator(Brand brand) {
        super(brand);
    }

    @Override
    public void running() {
        elcAppBrand.running("冰箱");
    }
}
