package com.java.behavioralType.iterator;

/**
 * 聚合抽象类（聚合抽象）
 */
public interface Aggregate {

    /**
     * 添加元素
     */
    void add(Object obj);

    /**
     * 删除元素
     */
    void remove(Object obj);

    /**
     * 获取迭代器
     */
    Iterator getIterator();
}
