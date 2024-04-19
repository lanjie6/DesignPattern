package com.java.createType.builder;

/**
 * 汽车外壳类
 */
public class CarShell {

    private String name;

    public CarShell(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
