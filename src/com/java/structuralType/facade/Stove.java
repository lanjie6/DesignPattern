package com.java.structuralType.facade;

/**
 * 天然气灶类
 */
public class Stove {

    /**
     * 点火并放上铁锅方法
     */
    public void fireUpAndPlace(IronPan pan, Food food) {
        pan.saute(food);
    }
}
