package com.java.principle;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法原则-反例
 */
public class DimifatPrincipleDemo01 {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.printAllStudent(new JuniorMiddleStudentManager());
    }
}

/**
 * 高中部学生类
 */
class Student {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


/**
 * 初中部学生类
 */
class JuniorMiddleStudent {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 中学学生管理类
 */
class StudentManager {

    /**
     * 获取所有高中学生
     */
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Student hightStudent = new Student();
            hightStudent.setId("高中学生：" + i + "号");
            studentList.add(hightStudent);
        }
        return studentList;
    }

    /**
     * 打印所有中学学生信息
     */
    public void printAllStudent(JuniorMiddleStudentManager middleStudentManager) {
        List<JuniorMiddleStudent> juniorMiddleStudentList = middleStudentManager.getAllStudent();
        System.out.println("初中学生：=======================");
        for (JuniorMiddleStudent middleStudent : juniorMiddleStudentList) {
            System.out.println(middleStudent.getId());
        }
        List<Student> allHightStudent = getAllStudent();
        System.out.println("高中学生：=======================");
        for (Student hightStudent : allHightStudent) {
            System.out.println(hightStudent.getId());
        }
    }
}


/**
 * 初中学生管理类
 */
class JuniorMiddleStudentManager {

    /**
     * 获取所有初中学生
     */
    public List<JuniorMiddleStudent> getAllStudent() {
        List<JuniorMiddleStudent> middleStudentList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            JuniorMiddleStudent middleStudent = new JuniorMiddleStudent();
            middleStudent.setId("初中学生：" + i + "号");
            middleStudentList.add(middleStudent);
        }
        return middleStudentList;
    }
}
