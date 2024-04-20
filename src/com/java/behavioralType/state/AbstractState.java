package com.java.behavioralType.state;

/**
 * 抽象状态类
 */
public abstract class AbstractState {

    //环境
    protected ScoreContext environment;

    //状态名
    protected String stateName;

    //分数
    protected int score;

    /**
     * 检查当前状态
     */
    public abstract void checkState();

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，当前分数：" + score);
        checkState();
        System.out.println("分，当前状态：" + environment.getState().stateName);
    }
}
