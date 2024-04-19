package com.java.structuralType.combination;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 袋子类（树枝构件）
 */
public class Bags implements Articles {

    /**
     * 袋子名称
     */
    private String name;

    /**
     * 持有商品的集合
     */
    private List<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    /**
     * 添加商品
     */
    public void add(Articles articles) {
        bags.add(articles);
    }

    /**
     * 删除商品
     */
    public void remove(Articles articles) {
        bags.remove(articles);
    }

    /**
     * 获取某一个商品
     */
    public Articles getChild(int i) {
        return bags.get(i);
    }

    /**
     * 计算所有价格
     */
    public double calculation() {
        BigDecimal total = new BigDecimal("0");
        for (Articles bag : bags) {
            total = total.add(BigDecimal.valueOf(bag.calculation()));
        }
        return total.doubleValue();
    }

    /**
     * 打印所有商品信息
     */
    public void show() {
        for (Articles bag : bags) {
            bag.show();
        }
    }
}
