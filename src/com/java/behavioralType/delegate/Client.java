package com.java.behavioralType.delegate;

/**
 * 使用委派模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.handOverSomething();
    }
}
