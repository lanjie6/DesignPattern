package com.java.structuralType.adapterModel;

/**
 * 电脑类（相当于使用方即客户端）
 * 只有USB接口
 */
public class Computer {

    /**
     * 使用某USB设备方法
     */
    public String useElectronicEquipment(USB usb) {
        return usb.provideUsbSomething();
    }

    public static void main(String[] args) {
        //创建电脑使用电脑的功能
        Computer computer = new Computer();
        //使用移动硬盘
        System.out.println(computer.useElectronicEquipment(new MobileHardDisk()));
        //使用苹果手机
        System.out.println(computer.useElectronicEquipment(new USBAdapter()));
        //使用苹果手机（对象适配器）
        System.out.println(computer.useElectronicEquipment(new USBAdapter1(new ApplePhone())));
    }
}
