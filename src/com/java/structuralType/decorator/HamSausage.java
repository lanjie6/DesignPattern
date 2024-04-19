package com.java.structuralType.decorator;

/**
 * 火腿肠类（具体装饰者类）
 */
public class HamSausage extends Decorator {

    public HamSausage(Noodles noodles) {
        super(noodles);
        this.desc += "火腿肠";
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 计算价格方法
     */
    public double cost() {
        return noodles.cost() + 1.5;
    }
}
