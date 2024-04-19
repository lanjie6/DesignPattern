package com.java.behavioralType.responsibility;

/**
 * 5000元及以下税费计算服务（具体处理者）
 */
public class LessFiveThousandTaxationService extends TaxationService {

    /**
     * 计算税费的方法
     *
     * @param request 税费请求对象
     * @return 应缴纳的税费
     */
    public double calculateTaxation(TaxationCalculateRequest request) {
        if (request.getMonthlyIncome() <= 5000) {
            return 0.0;
        }
        return taxationService.calculateTaxation(request);
    }
}
