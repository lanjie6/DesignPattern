package com.java.structuralType.facade;

/**
 * 这里客户端模拟人对象
 */
public class Client {

    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        cooker.cooking();
        System.out.println("开始吃碗里做好的食物");
    }
}
