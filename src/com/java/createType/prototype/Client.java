package com.java.createType.prototype;

/**
 * 使用原型模式的客户端（访问角色）
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //创建奖状原型
        Citation citation = new Citation("xx", "同学：在2021学年第一学期中表现优秀，被评为三好学生。", "成都学院");

        //克隆奖状，并写上每个同学的姓名
        Citation zhangSanCitation= (Citation) citation.clone();
        zhangSanCitation.setName("张三");
        zhangSanCitation.display();

        Citation liSiCitation= (Citation) citation.clone();
        liSiCitation.setName("李四");
        liSiCitation.display();

        System.out.println(citation == zhangSanCitation);
    }
}
