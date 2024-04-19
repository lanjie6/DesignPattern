package com.java.structuralType.adapterModel;

/**
 * 移动硬盘
 */
public class MobileHardDisk implements USB {

    @Override
    public String provideUsbSomething() {
        return "提供移动硬盘的功能";
    }
}
