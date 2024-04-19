package com.java.createType.factory.abs;

/**
 * 中华牌工厂类
 */
public class ZhongHuaFactory implements ToothBrushingFactory {

    @Override
    public Toothpaste createToothpaste() {
        Toothpaste toothpaste = new ZhongHuaToothpaste();
        toothpaste.createPaste();
        toothpaste.createShell();
        toothpaste.pack();
        return toothpaste;
    }

    @Override
    public Toothbrush createToothbrush() {
        Toothbrush toothbrush = new ZhongHuaToothbrush();
        toothbrush.createHandle();
        toothbrush.createHair();
        toothbrush.pack();
        return toothbrush;
    }
}
