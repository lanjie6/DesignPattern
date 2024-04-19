package com.java.createType.single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 单例模式-演示静态内部类方式的暴力反射破解和序列化破解
 */
public class SingletonTypeDemo10 {

    public static void main(String[] args) throws Exception {
        //利用反射创建对象，从而破坏单利模式的设计
        Constructor<SingletonTypeDemo9> constructor = SingletonTypeDemo9.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonTypeDemo9 instance1 = constructor.newInstance();
        SingletonTypeDemo9 instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);

        //利用反序列化可以创建多个该类的对象，从而破坏单例模式的设计
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/bonc/temp.txt"));
        oos.writeObject(instance1);
        oos.close();
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/bonc/temp.txt"));
        SingletonTypeDemo9 instance3 = (SingletonTypeDemo9) ois.readObject();
        System.out.println(instance1 == instance3);
    }
}
