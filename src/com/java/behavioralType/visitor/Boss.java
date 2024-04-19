package com.java.behavioralType.visitor;

/**
 * 老板类（具体访问者角色）
 * 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
 */
public class Boss implements AccountBookViewer{

    //总共收入的金额
    private double totalIncome;

    //总共消费的金额
    private double totalConsume;

    @Override
    public void viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
}
