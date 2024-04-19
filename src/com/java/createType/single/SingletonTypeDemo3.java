package com.java.createType.single;

/**
 * 单例模式-懒汉式一
 */
public class SingletonTypeDemo3 {

    //1.持有一个该类的静态变量
    private static SingletonTypeDemo3 sgt;

    //2.私有化构造器
    private SingletonTypeDemo3() {

    }

    //3.提供一个静态公有方法，当使用到该方法时，才去创建sgt单例对象。即懒汉式
    public static SingletonTypeDemo3 getInstance() {
        if (sgt == null) {
            sgt = new SingletonTypeDemo3();
        }
        return sgt;
    }
}
