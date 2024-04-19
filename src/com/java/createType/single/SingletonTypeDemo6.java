package com.java.createType.single;

/**
 * 单例模式-懒汉式四
 */
public class SingletonTypeDemo6 {

    //1.持有一个该类的静态变量
    private static SingletonTypeDemo6 sgt;

    //2.私有化构造器
    private SingletonTypeDemo6() {

    }

    //3.提供一个静态公有方法，加入双重检查的代码，解决线程安全问题，解决懒加载问题，解决了效率问题
    public static SingletonTypeDemo6 getInstance() {
        if (sgt == null) {
            synchronized (SingletonTypeDemo6.class) {
                if (sgt == null) {
                    sgt = new SingletonTypeDemo6();
                }
            }
        }
        return sgt;
    }
}
