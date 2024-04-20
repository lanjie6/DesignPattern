package com.java.behavioralType.state;

/**
 * 中等 （具体状态类）
 */
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        environment = state.environment;
        stateName = "中等";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            environment.setState(new LowState(this));
        } else if (score >= 90) {
            environment.setState(new HighState(this));
        }
    }
}
