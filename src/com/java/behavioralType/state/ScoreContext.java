package com.java.behavioralType.state;

/**
 * 学生成绩状态测试类（环境类）
 */
public class ScoreContext {

    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
