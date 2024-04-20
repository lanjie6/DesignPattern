package com.java.behavioralType.state;

/**
 * 不及格（具体状态类）
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext scoreContext) {
        environment = scoreContext;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        environment = state.environment;
        stateName = "不及格";
        score = state.score;
    }

    public void checkState() {
        if (score >= 90) {
            environment.setState(new HighState(this));
        } else if (score >= 60) {
            environment.setState(new MiddleState(this));
        }
    }
}
