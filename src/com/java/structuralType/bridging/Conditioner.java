package com.java.structuralType.bridging;

/**
 * 空调类（相当于扩展抽象角色）
 */
public class Conditioner extends ElectricAppliance {

    public Conditioner(Brand brand) {
        super(brand);
    }

    @Override
    public void running() {
        elcAppBrand.running("空调");
    }
}
