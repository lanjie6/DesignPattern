package com.java.createType.factory.method;


/**
 * 中华牌工厂类
 */
public class ZhongHuaFactory implements ToothpasteFactory {

    @Override
    public Toothpaste createToothpaste() {
        Toothpaste toothpaste = new ZhongHuaToothpaste();
        toothpaste.createPaste();
        toothpaste.createShell();
        toothpaste.pack();
        return toothpaste;
    }
}
