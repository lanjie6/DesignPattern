package com.java.behavioralType.responsibility;

/**
 * 税费计算请求对象（请求对象）
 */
public class TaxationCalculateRequest {

    /*
     * 月收入
     */
    private double monthlyIncome;

    /*
     * 基础税费
     */
    private double baseTaxation;

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getBaseTaxation() {
        return baseTaxation;
    }

    public void setBaseTaxation(double baseTaxation) {
        this.baseTaxation = baseTaxation;
    }
}
