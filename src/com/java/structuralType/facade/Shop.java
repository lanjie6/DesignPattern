package com.java.structuralType.facade;

/**
 * 商店类
 */
public class Shop {

    /**
     * 购买食材方法
     */
    public Food getFood() {
        System.out.println("从菜市场买到了食材");
        return new Food();
    }
}
