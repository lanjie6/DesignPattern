package com.java.structuralType.bridging;

/**
 * 海尔品牌实现类（相当于具体实现角色）
 */
public class Haier implements Brand {

    private String name = "海尔";

    @Override
    public void running(String type) {
        System.out.println("以" + name + type + "的方式运行……");
    }
}
