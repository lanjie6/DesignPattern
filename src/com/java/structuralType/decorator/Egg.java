package com.java.structuralType.decorator;

/**
 * 鸡蛋类（具体装饰者类）
 */
public class Egg extends Decorator {

    public Egg(Noodles noodles) {
        super(noodles);
        this.desc += "鸡蛋";
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 计算价格方法
     */
    public double cost() {
        return noodles.cost() + 2.0;
    }
}
