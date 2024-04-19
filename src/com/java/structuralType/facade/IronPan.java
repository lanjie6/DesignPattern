package com.java.structuralType.facade;

/**
 * 铁锅类
 */
public class IronPan {

    /**
     * 放入食材
     */
    public void makeIn(Food food) {
        System.out.println("将切好的食材放入铁锅中");
    }

    /**
     * 炒食材
     */
    public void saute(Food food) {
        System.out.println("对食材进行煎炒……");
    }
}
