package com.java.behavioralType.responsibility;

/**
 * 8000元及以下税费计算服务（具体处理者）
 */
public class LessEightThousandTaxationService extends TaxationService {

    /**
     * 计算税费的方法
     *
     * @param request 税费请求对象
     * @return 应缴纳的税费
     */
    public double calculateTaxation(TaxationCalculateRequest request) {
        double monthlyIncome = request.getMonthlyIncome();
        if (monthlyIncome <= 8000) {
            return request.getBaseTaxation() + (monthlyIncome - 5000) * 0.05;
        }
        request.setBaseTaxation((8000 - 5000) * 0.05);
        return taxationService.calculateTaxation(request);
    }
}
