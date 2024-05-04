package com.java.principle;

/**
 * 单一职能原则-反例
 */
public class SingleFunctionPrincipleDemo1 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teach("汉语拼音和识字");
        teacher.teach("加减乘除法");
        teacher.teach("微积分");
    }

}

/**
 * 老师类
 */
class Teacher {

    public void teach(String content) {
        System.out.println("教授小学生：" + content);
    }
}
