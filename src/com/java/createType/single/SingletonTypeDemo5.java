package com.java.createType.single;

/**
 * 单例模式-懒汉式三
 */
public class SingletonTypeDemo5 {

    //1.持有一个该类的静态变量
    private static SingletonTypeDemo5 sgt;

    //2.私有化构造器
    private SingletonTypeDemo5() {

    }

    //3.提供一个静态公有方法，加入同步处理的代码，解决线程安全问题
    public static SingletonTypeDemo5 getInstance() {
        if (sgt == null) {
            synchronized (SingletonTypeDemo5.class) {
                sgt = new SingletonTypeDemo5();
            }
        }
        return sgt;
    }
}
