package com.java.behavioralType.interpreter;

/**
 * 抽象表达式类
 */
public interface Expression {

    /**
     * 解释方法
     */
    boolean interpret(String info);
}
