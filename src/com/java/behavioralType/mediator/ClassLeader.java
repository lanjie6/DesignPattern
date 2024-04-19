package com.java.behavioralType.mediator;

/**
 * 班委员接口（抽象同事类）
 */
public abstract class ClassLeader {

    //持有对中介者的引用
    protected Mediator media;

    /**
     * 本职工作
     */
    public abstract void job();

    /**
     * 向班长提出请求
     */
    public abstract void sendRequest();
}
