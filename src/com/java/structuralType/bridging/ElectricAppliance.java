package com.java.structuralType.bridging;

/**
 * 电器抽象类（相当于抽象角色）
 * 充当了桥接的角色（桥梁），将电器和品牌两个抽象角色连接起来。
 */
public abstract class ElectricAppliance {

    /*
     * 电器品牌
     */
    protected Brand elcAppBrand;

    public ElectricAppliance(Brand elcAppBrand) {
        this.elcAppBrand = elcAppBrand;
    }

    /**
     * 运行方式
     */
    public abstract void running();

}
