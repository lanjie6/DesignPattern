package com.java.structuralType.decorator;

/**
 * 抽象装饰者类（抽象装饰者）
 */
public abstract class Decorator extends Noodles {

    /*
     * 持有一个抽象被装饰者的引用
     */
    protected Noodles noodles;

    public Decorator(Noodles noodles) {
        this.noodles = noodles;
        this.desc = noodles.getDesc();
    }

    /**
     * 计算面条价格方法（根据不同的配料计价所以是抽象方法）
     */
    public abstract double cost();
}
