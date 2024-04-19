package com.java.createType.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式-演示暴力反射
 */
public class SingletonTypeDemo7 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //调用两次方法，单例模式成立
        SingletonTypeDemo6 singletonTypeDemo61 = SingletonTypeDemo6.getInstance();
        SingletonTypeDemo6 singletonTypeDemo62 = SingletonTypeDemo6.getInstance();
        System.out.println(singletonTypeDemo61 == singletonTypeDemo62);

        //使用暴力反射破解单例
        Class<?> aClass = Class.forName("com.java.createType.single.SingletonTypeDemo6");
        Constructor<?> constructor = aClass.getDeclaredConstructor(null);
        //将构造方法设置为允许访问
        constructor.setAccessible(true);
        SingletonTypeDemo6 instance1 = (SingletonTypeDemo6) constructor.newInstance();
        SingletonTypeDemo6 instance2 = (SingletonTypeDemo6) constructor.newInstance();
        System.out.println(instance1 == instance2);
    }
}
