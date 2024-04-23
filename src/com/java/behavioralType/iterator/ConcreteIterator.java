package com.java.behavioralType.iterator;

import java.util.List;

/**
 * 迭代器实现类（具体迭代器）
 */
public class ConcreteIterator implements Iterator {

    //需要迭代的集合
    private List<Object> list;

    //当前索引下标
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public Object first() {
        return list.get(0);
    }

    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
