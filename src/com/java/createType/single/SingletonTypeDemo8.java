package com.java.createType.single;

/**
 * 单例模式-懒汉式五
 */
public class SingletonTypeDemo8 {

    //1.持有一个该类的静态变量
    //5.使用volatile防止重排序
    private volatile static SingletonTypeDemo8 sgt;

    //2.私有化构造器
    private SingletonTypeDemo8() {
        //4.加上一个判断，防止暴力反射
        if (sgt != null) {
            throw new RuntimeException();
        }
    }

    //3.提供一个静态公有方法，加入双重检查的代码，解决线程安全问题，解决懒加载问题，解决了效率问题
    public static SingletonTypeDemo8 getInstance() {
        if (sgt == null) {
            synchronized (SingletonTypeDemo8.class) {
                if (sgt == null) {
                    sgt = new SingletonTypeDemo8();
                }
            }
        }
        return sgt;
    }
}
