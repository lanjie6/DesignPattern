package com.java.principle;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法原则-正例
 */
public class DimifatPrincipleDemo02 {

    public static void main(String[] args) {
        StudentManager1 studentManager = new StudentManager1();
        studentManager.printAllStudent(new JuniorMiddleStudentManager1());
    }
}

/**
 * 高中学生类
 */
class Student1 {

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
class JuniorMiddleStudent1 {
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
class StudentManager1 {

    /**
     * 获取所有高中学生
     */
    public List<Student1> getAllStudent() {
        List<Student1> studentList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Student1 hightStudent = new Student1();
            hightStudent.setId("高中学生：" + i + "号");
            studentList.add(hightStudent);
        }
        return studentList;
    }

    /**
     * 打印所有中学学生信息
     */
    public void printAllStudent(JuniorMiddleStudentManager1 middleStudentManager) {
        middleStudentManager.printAllMiddleStudent();
        List<Student1> allHightStudent = getAllStudent();
        System.out.println("高中学生：=======================");
        for (Student1 hightStudent : allHightStudent) {
            System.out.println(hightStudent.getId());
        }
    }
}


/**
 * 初中学生管理类
 */
class JuniorMiddleStudentManager1 {

    /**
     * 获取所有初中学生
     */
    public List<JuniorMiddleStudent1> getAllStudent() {
        List<JuniorMiddleStudent1> middleStudentList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            JuniorMiddleStudent1 middleStudent = new JuniorMiddleStudent1();
            middleStudent.setId("初中学生：" + i + "号");
            middleStudentList.add(middleStudent);
        }
        return middleStudentList;
    }

    /**
     * 打印所有初中学生信息
     */
    public void printAllMiddleStudent() {
        List<JuniorMiddleStudent1> juniorMiddleStudentList = getAllStudent();
        System.out.println("初中学生：=======================");
        for (JuniorMiddleStudent1 middleStudent : juniorMiddleStudentList) {
            System.out.println(middleStudent.getId());
        }
    }
}
