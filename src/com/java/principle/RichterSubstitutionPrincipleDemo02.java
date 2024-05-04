package com.java.principle;

/**
 * 里氏替换原则-正例
 */
public class RichterSubstitutionPrincipleDemo02 {

    public static void main(String[] args) {
        System.out.println("Dog对象执行方法：------------------------------------");
        Dog1 dog = new Dog1();
        dog.action();

        System.out.println("SamoyeDog对象执行方法：------------------------------------");
        SamoyeDog samoyeDog = new SamoyeDog();
        samoyeDog.action();
        samoyeDog.cry();
    }
}

/**
 * 狗类
 */
class Dog1 {

    /**
     * 活动方式
     */
    public void action() {
        System.out.println("不会爬树，白天活动，晚上不活动！");
    }

}

/**
 * 萨摩耶狗类
 */
class SamoyeDog extends Dog1 {

    public void cry() {
        System.out.println("汪！汪！汪！");
    }

}
