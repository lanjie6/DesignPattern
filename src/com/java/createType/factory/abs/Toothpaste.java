package com.java.createType.factory.abs;

/**
 * 牙膏抽象类
 */
public abstract class Toothpaste {

    protected String brand;

    public void createPaste() {
        System.out.println("产生了" + brand + "的膏体");
    }

    public void createShell() {
        System.out.println("产生了" + brand + "的外壳");
    }

    public abstract void pack();

    @Override
    public String toString() {
        return brand + "的牙膏";
    }
}
