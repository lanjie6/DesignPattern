package com.java.principle;

/**
 * 单一职能原则-正例二
 */
public class SingleFunctionPrincipleDemo3 {

    public static void main(String[] args) {
        Teacher1 teacher = new Teacher1();
        teacher.teachPrimary("汉语拼音和识字");
        teacher.teachSenior("高中物理力学");
        teacher.teachUniversity("微积分");
    }
}

/**
 * 老师类
 */
class Teacher1 {

    public void teachPrimary(String content) {
        System.out.println("教授小学生知识中的：" + content);
    }

    public void teachSenior(String content) {
        System.out.println("教授高中生知识中的：" + content);
    }

    public void teachUniversity(String content) {
        System.out.println("教授大学生知识中的：" + content);
    }
}
