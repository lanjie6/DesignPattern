package com.java.createType.factory.method;


/**
 * 高露洁牌工厂类
 */
public class GaoLuJieFactory implements ToothpasteFactory {

    @Override
    public Toothpaste createToothpaste() {
        Toothpaste toothpaste = new GaoLuJieToothpaste();
        toothpaste.createPaste();
        toothpaste.createShell();
        toothpaste.pack();
        return toothpaste;
    }
}
