package com.java.structuralType.proxy;

/**
 * 金士顿内存条（真实主题）
 */
public class KingstonMemoryModule implements MemoryModule {

    @Override
    public void sell(int money) {
        System.out.println("金士顿厂商以" + money +  "的金额出售内存条");
    }
}
