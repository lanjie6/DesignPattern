package com.java.behavioralType.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合实现类，内部封装一个集合来作为数据的聚合（具体聚合）
 */
public class ConcreteAggregate implements Aggregate {

    //持有一个集合
    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
