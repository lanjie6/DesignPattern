package com.java.structuralType.decorator;

/**
 * 热干面条类（具体的主体被装饰者）
 */
public class HotDryNoodles extends Noodles {

    public HotDryNoodles() {
        this.desc = "热干面";
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 计算面条价格方法（根据不同的配料计价所以是抽象方法）
     */
    @Override
    public double cost() {
        return 15.0;
    }
}
