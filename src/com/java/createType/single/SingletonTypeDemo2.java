package com.java.createType.single;

/**
 * 单例模式-饿汉式二
 */
public class SingletonTypeDemo2 {

    // 1.私有化构造器：为了让外部不能创建该类的对象（不能 new）
    private SingletonTypeDemo2() {

    }

    // 2.本类内部创建一个该类实例
    private static SingletonTypeDemo2 sgt;

    static {//在静态代码块中，创建单例对象
        sgt = new SingletonTypeDemo2();
    }

    // 3.对外提供一个公有的静态方法，返回实例对象
    public static SingletonTypeDemo2 getInstance() {
        return sgt;
    }
}
