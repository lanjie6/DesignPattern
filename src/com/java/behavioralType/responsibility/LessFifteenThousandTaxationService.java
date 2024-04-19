package com.java.behavioralType.responsibility;

/**
 * 15000元及以下税费计算服务（具体处理者）
 */
public class LessFifteenThousandTaxationService extends TaxationService {

    /**
     * 计算税费的方法
     *
     * @param request 税费请求对象
     * @return 应缴纳的税费
     */
    public double calculateTaxation(TaxationCalculateRequest request) {
        double monthlyIncome = request.getMonthlyIncome();
        if (monthlyIncome <= 15000) {
            return request.getBaseTaxation() + (monthlyIncome - 8000) * 0.1;
        }
        request.setBaseTaxation(request.getBaseTaxation() + (15000 - 8000) * 0.1);
        return taxationService.calculateTaxation(request);
    }
}
