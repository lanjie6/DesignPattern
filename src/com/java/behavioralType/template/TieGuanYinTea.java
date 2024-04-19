package com.java.behavioralType.template;

/**
 * 泡铁观音功夫茶
 */
public class TieGuanYinTea extends KungFuTea {
    @Override
    public void wash() {
        System.out.println("用预热的泉水加热和冲洗宜兴紫砂茶壶（或盖碗）");
    }

    @Override
    public void addTeaLeaves() {
        System.out.println("加入铁观音茶茶叶。");
    }
}
