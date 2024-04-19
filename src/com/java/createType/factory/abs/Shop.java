package com.java.createType.factory.abs;

/**
 * 商店类用于用户消费者购买刷牙工具
 */
public class Shop {

    /**
     * 卖刷牙工具方法
     *
     * @param toothBrushingFactory 刷牙工具的品牌工厂
     * @return 刷牙工具对象
     */
    public String sellToothbrushUtils(ToothBrushingFactory toothBrushingFactory) {
        Toothpaste toothpaste = toothBrushingFactory.createToothpaste();
        Toothbrush toothbrush = toothBrushingFactory.createToothbrush();

        return toothpaste + "和" + toothbrush;
    }
}
