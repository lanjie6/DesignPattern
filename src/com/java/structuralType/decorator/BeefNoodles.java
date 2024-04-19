package com.java.structuralType.decorator;

/**
 * 牛肉面条类（具体的主体被装饰者）
 */
public class BeefNoodles extends Noodles {

    public BeefNoodles() {
        this.desc = "牛肉面";
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 计算面条价格方法（根据不同的配料计价所以是抽象方法）
     */
    @Override
    public double cost() {
        //没有过多的if-- else  if的判断
        return 20.0;
    }
}
