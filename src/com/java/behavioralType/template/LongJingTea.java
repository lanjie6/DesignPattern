package com.java.behavioralType.template;

/**
 * 泡龙井功夫茶
 */
public class LongJingTea extends KungFuTea {
    @Override
    public void wash() {
        System.out.println("用预热的泉水加热和冲洗宜兴紫砂茶壶（或盖碗）");
    }

    @Override
    public void addTeaLeaves() {
        System.out.println("加入龙井茶茶叶。");
    }
}
