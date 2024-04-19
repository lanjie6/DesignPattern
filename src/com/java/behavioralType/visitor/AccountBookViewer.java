package com.java.behavioralType.visitor;

/**
 * 账单访问者接口（抽象访问者角色）
 */
public interface AccountBookViewer {

    /**
     * 查看消费的账单
     */
    void viewConsumeBill(ConsumeBill bill);

    /**
     * 查看收入的账单
     */
    void viewIncomeBill(IncomeBill bill);
}
