package com.java.createType.builder;

/**
 * 发动机类
 */
public class Engine {

    private String name;

    public Engine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
