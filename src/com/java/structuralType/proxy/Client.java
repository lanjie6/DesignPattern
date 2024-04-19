package com.java.structuralType.proxy;

/**
 * 使用代理模式的客户端（模拟用户购买金士顿内存条）
 */
public class Client {

    public static void main(String[] args) {
        //客户向内存条代理商给了150元购买内存条
        MemoryModuleProxy memoryModuleProxy = new MemoryModuleProxy();
        memoryModuleProxy.sell(150);
    }
}
