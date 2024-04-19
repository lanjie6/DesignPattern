package com.java.createType.single;

/**
 * 单例模式-懒汉式二
 */
public class SingletonTypeDemo4 {

    //1.持有一个该类的静态变量
    private static SingletonTypeDemo4 sgt;

    //2.私有化构造器
    private SingletonTypeDemo4() {

    }

    //3.提供一个静态公有方法，加入同步处理的代码，解决线程安全问题。
    public synchronized static SingletonTypeDemo4 getInstance() {
        if (sgt == null) {
            sgt = new SingletonTypeDemo4();
        }
        return sgt;
    }
}
