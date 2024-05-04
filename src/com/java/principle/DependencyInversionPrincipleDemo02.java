package com.java.principle;

/**
 * 依赖倒置原则-正例
 */
public class DependencyInversionPrincipleDemo02 {

    public static void main(String[] args) {
        Computer1 computer = new Computer1();
        computer.access(new Mouse1());
        computer.access(new Keyboard1());
        computer.access(new Sound1());
    }
}

/**
 * 电脑类
 */
class Computer1 {

    /**
     * 接入设备方法
     */
    public void access(USB usb) {
        System.out.println("电脑上：" + usb.afterAccess());
    }

}

interface USB {

    /**
     * 接入方法
     */
    String afterAccess();
}

/**
 * 鼠标类
 */
class Mouse1 implements USB {

    public String afterAccess() {
        return "鼠标已接入";
    }

}

/**
 * 键盘类
 */
class Keyboard1 implements USB {

    public String afterAccess() {
        return "键盘已接入";
    }

}

/**
 * 音响类
 */
class Sound1 implements USB {

    public String afterAccess() {
        return "音响已接入";
    }

}
