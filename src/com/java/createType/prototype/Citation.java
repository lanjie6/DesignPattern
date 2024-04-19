package com.java.createType.prototype;

/**
 * 奖状类（具体原型角色）
 * 其中JDK提供的Cloneable接口就是抽象原型角色
 */
public class Citation implements Cloneable {
    /**
     * 获奖学生名字
     */
    String name;

    /**
     * 获奖信息
     */
    String info;

    /**
     * 学院
     */
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    /**
     * 设置不同学生的奖状名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 陈列奖状信息的方法
     */
    public void display() {
        System.out.println(name + info + college);
    }

    /**
     * 重写克隆方法
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
}
