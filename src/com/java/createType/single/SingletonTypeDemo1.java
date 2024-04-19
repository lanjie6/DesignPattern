package com.java.createType.single;

/**
 * 单例模式-饿汉式一
 */
public class SingletonTypeDemo1 {


    // 1.私有化构造器：为了让外部不能创建该类的对象（不能 new）
    private SingletonTypeDemo1() {

    }

    // 2.本类内部创建一个该类实例
    private static final SingletonTypeDemo1 sgt = new SingletonTypeDemo1();

    // 3.对外提供一个公有的静态方法，返回实例对象
    public static SingletonTypeDemo1 getInstance() {
        return sgt;
    }

}
