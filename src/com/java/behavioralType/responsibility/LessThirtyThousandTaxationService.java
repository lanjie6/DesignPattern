package com.java.behavioralType.responsibility;

/**
 * 30000元及以下税费计算服务（具体处理者）
 */
public class LessThirtyThousandTaxationService extends TaxationService {

    /**
     * 计算税费的方法
     *
     * @param request 税费请求对象
     * @return 应缴纳的税费
     */
    public double calculateTaxation(TaxationCalculateRequest request) {
        double monthlyIncome = request.getMonthlyIncome();
        if (monthlyIncome <= 30000) {
            return request.getBaseTaxation() + (monthlyIncome - 15000) * 0.15;
        }
        request.setBaseTaxation(request.getBaseTaxation() + (30000 - 15000) * 0.15);
        return taxationService.calculateTaxation(request);
    }
}
