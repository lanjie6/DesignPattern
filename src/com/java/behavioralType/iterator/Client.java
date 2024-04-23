package com.java.behavioralType.iterator;

/**
 * 使用迭代器模式的客户端类
 */
public class Client {

    public static void main(String[] args) {
        //创建聚合对象
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");

        Iterator it = ag.getIterator();

        //获取第一个元素
        Object ob = it.first();
        System.out.println("第一个元素：" + ob);

        //删除一个元素
        ag.remove("韶关学院");

        //遍历聚合元素
        System.out.println("遍历聚合对象：");
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

    }
}
