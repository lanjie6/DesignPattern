package com.java.structuralType.decorator;

/**
 * 面条抽象类（抽象的主体被装饰者）
 */
public abstract class Noodles {

    protected String desc;

    public String getDesc() {
        return desc;
    }

    /**
     * 计算面条价格方法（根据不同的配料计价所以是抽象方法）
     */
    public abstract double cost();
}
