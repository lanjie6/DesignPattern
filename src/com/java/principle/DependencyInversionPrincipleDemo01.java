package com.java.principle;

/**
 * 依赖倒置原则-反例
 */
public class DependencyInversionPrincipleDemo01 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.access(new Mouse());
        computer.access(new Keyboard());
        computer.access(new Sound());
    }
}

/**
 * 电脑类
 */
class Computer {

    /**
     * 接入设备方法
     */
    public void access(Mouse mouse) {
        System.out.println("电脑上：" + mouse.afterAccess());
    }

    /**
     * 接入设备方法
     */
    public void access(Keyboard k) {
        System.out.println("电脑上：" + k.afterAccess());
    }

    /**
     * 接入设备方法
     */
    public void access(Sound s) {
        System.out.println("电脑上：" + s.afterAccess());
    }


}

/**
 * 鼠标类
 */
class Mouse {

    public String afterAccess() {
        return "鼠标已接入";
    }

}

/**
 * 键盘类
 */
class Keyboard {

    public String afterAccess() {
        return "键盘已接入";
    }

}

/**
 * 音响类
 */
class Sound {

    public String afterAccess() {
        return "音响已接入";
    }

}
