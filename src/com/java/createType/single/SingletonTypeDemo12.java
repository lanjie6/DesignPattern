package com.java.createType.single;

/**
 * 单例模式-枚举类
 */
public class SingletonTypeDemo12 {

    //1.私有化构造函数
    private SingletonTypeDemo12() {

    }

    //2.定义一个静态枚举类
    static enum SingletonEnum {
        //3.创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private SingletonTypeDemo12 singletonTypeDemo12;

        //4.私有化枚举的构造函数
        private SingletonEnum() {
            singletonTypeDemo12 = new SingletonTypeDemo12();
        }

        //5.提供一个方法用于返回枚举类中创建的对象
        public SingletonTypeDemo12 getInstance() {
            return singletonTypeDemo12;
        }
    }
}
