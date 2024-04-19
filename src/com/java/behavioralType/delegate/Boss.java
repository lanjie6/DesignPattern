package com.java.behavioralType.delegate;

/**
 * 老板类
 */
public class Boss {

    /**
     * 交代经理去做某事
     */
    public void handOverSomething() {
        Manager mng = new Manager(new OrdinaryEmployee());
        mng.doSomething();
    }
}
