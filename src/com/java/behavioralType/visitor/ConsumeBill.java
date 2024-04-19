package com.java.behavioralType.visitor;

/**
 * 消费的账单（具体元素角色）
 */
public class ConsumeBill implements Bill {

    //金额
    private double amount;

    //消费的事项
    private String item;

    public ConsumeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer viewer) {
        viewer.viewConsumeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
