package com.java.createType.factory.simple;

/**
 * 用于生产牙膏的简单工厂
 */
public class SimpleFactory {

    /**
     * 创建牙膏方法
     */
    public static Toothpaste createToothpaste(String brand) {
        Toothpaste toothpaste = null;
        if ("中华牌".equals(brand)) {
            toothpaste = new ZhongHuaToothpaste();
        } else if ("高露洁牌".equals(brand)) {
            toothpaste = new GaoLuJieToothpaste();
        }
        if (toothpaste != null) {
            toothpaste.createPaste();
            toothpaste.createShell();
            toothpaste.pack();
        }
        return toothpaste;
    }
}
