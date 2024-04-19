package com.java.behavioralType.iterator;

/**
 * 迭代器接口（抽象迭代器）
 */
public interface Iterator {

    /**
     * 获取第一个元素
     */
    Object first();

    /**
     * 获取下一个元素
     */
    Object next();

    /**
     * 判断是否有下一个元素
     */
    boolean hasNext();
}
