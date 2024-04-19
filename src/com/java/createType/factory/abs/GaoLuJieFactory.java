package com.java.createType.factory.abs;

/**
 * 高露洁工厂类
 */
public class GaoLuJieFactory implements ToothBrushingFactory {

    @Override
    public Toothpaste createToothpaste() {
        Toothpaste toothpaste = new GaoLuJieToothpaste();
        toothpaste.createPaste();
        toothpaste.createShell();
        toothpaste.pack();
        return toothpaste;
    }

    @Override
    public Toothbrush createToothbrush() {
        Toothbrush toothbrush = new GaoLuJieToothbrush();
        toothbrush.createHandle();
        toothbrush.createHair();
        toothbrush.pack();
        return toothbrush;
    }
}
