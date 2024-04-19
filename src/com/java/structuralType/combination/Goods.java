package com.java.structuralType.combination;

import java.math.BigDecimal;

/**
 * 商品类（树叶构件）
 */
public class Goods implements Articles {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品数量
     */
    private int quantity;

    /**
     * 商品单价
     */
    private double unitPrice;

    public Goods(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public double calculation() {
        return BigDecimal.valueOf(unitPrice)
                .multiply(BigDecimal.valueOf(quantity)).doubleValue();
    }

    @Override
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }
}
