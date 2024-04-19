package com.java.behavioralType.visitor;

/**
 * 账单接口（抽象元素角色）
 */
public interface Bill {

    /**
     * 对账单进行访问
     * @param viewer 访问者对象
     */
    void accept(AccountBookViewer viewer);
}
