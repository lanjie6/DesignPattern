package com.java.behavioralType.responsibility;

/**
 * 使用责任链模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        //创建各个税费计算对象
        TaxationService taxationService1 = new LessFiveThousandTaxationService();
        TaxationService taxationService2 = new LessEightThousandTaxationService();
        TaxationService taxationService3 = new LessFifteenThousandTaxationService();
        TaxationService taxationService4 = new LessThirtyThousandTaxationService();

        //构建计算的责任链
        taxationService1.setTaxationService(taxationService2);
        taxationService2.setTaxationService(taxationService3);
        taxationService3.setTaxationService(taxationService4);

        //计算月收入4500的税费
        TaxationCalculateRequest request = new TaxationCalculateRequest();
        request.setMonthlyIncome(4500);
        double taxation = taxationService1.calculateTaxation(request);
        System.out.println("月收入4500元应该缴纳的税费是：" + taxation);

        //计算月收入7500的税费
        request.setMonthlyIncome(7500);
        taxation = taxationService1.calculateTaxation(request);
        System.out.println("月收入7500元应该缴纳的税费是：" + taxation);

        //计算月收入11000的税费
        request.setMonthlyIncome(11000);
        taxation = taxationService1.calculateTaxation(request);
        System.out.println("月收入11000元应该缴纳的税费是：" + taxation);

        //计算月收入19000的税费
        request.setMonthlyIncome(19000);
        taxation = taxationService1.calculateTaxation(request);
        System.out.println("月收入19000元应该缴纳的税费是：" + taxation);
    }
}
