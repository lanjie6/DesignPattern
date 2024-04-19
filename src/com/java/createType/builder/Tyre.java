package com.java.createType.builder;

/**
 * 轮胎类
 */
public class Tyre {

    private String name;

    public Tyre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
