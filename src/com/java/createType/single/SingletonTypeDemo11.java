package com.java.createType.single;

import java.io.Serializable;

/**
 * 单例模式-静态内部类二
 */
public class SingletonTypeDemo11 implements Serializable {

    private SingletonTypeDemo11() {
        if (SingletonInside.SGT != null) {
            throw new RuntimeException();
        }
    }

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInside {
        private static final SingletonTypeDemo11 SGT = new SingletonTypeDemo11();
    }

    /**
     * 提供一个静态公有方法，直接返回SingletonInside.SGT解决线程安全问题，
     * 同时解决懒加载问题。同时解决了效率问题，推荐使用
     */
    public static SingletonTypeDemo11 getInstance() {
        return SingletonInside.SGT;
    }

    /**
     * 此方法作用是在反序列化时直接返回该方法的返回对象，而无需再去创建新的对象。
     */
    private Object readResolve() {
        return SingletonInside.SGT;
    }
}
