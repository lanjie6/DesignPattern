package com.java.principle;

/**
 * 单一职能原则-正例一
 */
public class SingleFunctionPrincipleDemo2 {

    public static void main(String[] args) {
        PrimaryTeacher primaryTeacher = new PrimaryTeacher();
        primaryTeacher.teach("汉语拼音和识字");
        primaryTeacher.teach("加减乘除法");

        UniversityTeacher universityTeacher = new UniversityTeacher();
        universityTeacher.teach("微积分");
    }

}

/**
 * 小学老师类
 */
class PrimaryTeacher {

    public void teach(String content) {
        System.out.println("教授小学生知识中的：" + content);
    }
}

/**
 * 大学老师类
 */
class UniversityTeacher {

    public void teach(String content) {
        System.out.println("教授大学生知识中的：" + content);
    }
}
