package com.java.structuralType.bridging;

/**
 * 格力品牌实现类（相当于具体实现角色）
 */
    public class Gree implements Brand {

    private String name = "格力";

    @Override
    public void running(String type) {
        System.out.println("以" + name + type + "的方式运行……");
    }
}
