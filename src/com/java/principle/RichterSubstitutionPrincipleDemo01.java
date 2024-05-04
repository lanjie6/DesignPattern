package com.java.principle;

/**
 * 里氏替换原则-反例
 */
public class RichterSubstitutionPrincipleDemo01 {

    public static void main(String[] args) {
        System.out.println("Dog对象执行方法：------------------------------------");
        Dog dog = new Dog();
        dog.action();

        System.out.println("Cat对象执行方法：------------------------------------");
        Dog dog2 = new Cat();
        dog2.action();
    }
}

/**
 * 狗类
 */
class Dog {

    /**
     * 活动方式
     */
    public void action() {
        System.out.println("不会爬树，白天活动，晚上不活动！");
    }

}

/**
 * 猫类
 */
class Cat extends Dog {

    @Override
    public void action() {
        System.out.println("会爬树，晚上活动，白天不活动！");
    }

    public void cry() {
        System.out.println("喵！喵！喵！");
    }

}
