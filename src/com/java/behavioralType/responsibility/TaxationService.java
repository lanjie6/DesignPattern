package com.java.behavioralType.responsibility;

/**
 * 税费管理服务（抽象处理者）
 */
public abstract class TaxationService {

    /*
     * 持有一个自己类型的引用也就是持有下一个处理者
     */
    protected TaxationService taxationService;

    /**
     * 也就是setNext方法
     */
    public void setTaxationService(TaxationService taxationService) {
        this.taxationService = taxationService;
    }

    /**
     * 计算税费的方法
     *
     * @param request 税费请求对象
     * @return 应缴纳的税费
     */
    public abstract double calculateTaxation(TaxationCalculateRequest request);

}
