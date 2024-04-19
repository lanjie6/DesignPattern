package com.java.behavioralType.template;

/**
 * 泡功夫茶的抽象类
 */
public abstract class KungFuTea {

    /**
     * 模板方法：用于定义整个算法的骨架，确定好整个算法的步骤顺序
     */
    public void makeTea() {
        wash();
        addTeaLeaves();
        makeFirst();
        maintainTeaUtil();
        smellTea();
        drinkTea();
    }

    /**
     * 1、沸水烫壶：“钩子”方法，默认空实现
     */
    protected void wash() {

    }

    /**
     * 2、加入茶叶
     */
    public abstract void addTeaLeaves();

    /**
     * 3、头茶洗茶
     */
    public void makeFirst() {
        System.out.println("加入第一次冲泡的热水，冲泡5-15秒，然后将茶倒入滤杯中。");
    }

    /**
     * 4、养护茶宠
     */
    public void maintainTeaUtil() {
        System.out.println("将第一次冲泡滤出来的茶水冲洗茶具。");
    }

    /**
     * 5、首道闻香
     */
    public void smellTea() {
        System.out.println("将首道茶水倒入闻香杯，捧杯闻香。");
    }

    /**
     * 6、泡茶品茶
     */
    public void drinkTea() {
        System.out.println("将沸水倒入紫砂壶，加盖泡制20秒，倒出后开始品尝。");
    }
}
