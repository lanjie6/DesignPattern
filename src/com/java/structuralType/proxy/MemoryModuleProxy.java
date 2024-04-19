package com.java.structuralType.proxy;

/**
 * 内存条代理商（代理）
 */
public class MemoryModuleProxy implements MemoryModule {

    /**
     * 持有金士顿内存条对象
     */
    private KingstonMemoryModule kingstonMemoryModule = new KingstonMemoryModule();

    @Override
    public void sell(int money) {
        preSell(money);

        //调用金士顿内存条的销售方法，默认金士顿厂商100元
        kingstonMemoryModule.sell(100);

        postSell(money);
    }

    /**
     * 打印代理商收取用户的钱（私有方法，让客户不可见）
     */
    private void preSell(int money) {
        System.out.println("代理商收取了客户" + money + "元钱");
    }

    /**
     * 打印代理商赚的钱（私有方法，让客户不可见）
     */
    private void postSell(int money) {
        System.out.println("代理商赚取了客户" + (money - 100) + "元钱");
    }
}
