package com.java.behavioralType.visitor;

/**
 * 收入账单（具体元素角色）
 */
public class IncomeBill implements Bill {

    //金额
    private double amount;

    //收入的事项
    private String item;

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer viewer) {
        viewer.viewIncomeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
