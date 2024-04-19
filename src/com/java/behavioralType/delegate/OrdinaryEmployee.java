package com.java.behavioralType.delegate;

/**
 * 普通员工类（具体任务角色也是被委派者）
 */
public class OrdinaryEmployee implements Employee {

    /**
     * 做倒茶水这件事
     */
    @Override
    public void doSomething() {
        System.out.println("您的茶来了，我刚倒的茶有点热您注意别烫着啊！");
    }
}
