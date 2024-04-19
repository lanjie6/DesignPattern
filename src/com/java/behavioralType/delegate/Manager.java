package com.java.behavioralType.delegate;

/**
 * 经理类（委派者角色）
 */
public class Manager implements Employee {

    private Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    /**
     * 做某事
     */
    @Override
    public void doSomething() {
        employee.doSomething();
    }
}
