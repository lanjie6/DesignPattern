package com.java.createType.single;

import java.io.Serializable;

/**
 * 单例模式-静态内部类一
 */
public class SingletonTypeDemo9 implements Serializable {

    private SingletonTypeDemo9() {

    }

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInside {
        private static final SingletonTypeDemo9 SGT = new SingletonTypeDemo9();
    }

    /**
     * 提供一个静态公有方法，直接返回SingletonInside.SGT解决线程安全问题，
     * 同时解决懒加载问题。同时解决了效率问题，推荐使用
     */
    public static SingletonTypeDemo9 getInstance() {
        return SingletonInside.SGT;
    }
}
