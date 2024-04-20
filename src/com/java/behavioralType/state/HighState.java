package com.java.behavioralType.state;

/**
 * 优秀
 */
public class HighState extends AbstractState {

    public HighState(AbstractState state) {
        environment = state.environment;
        stateName = "优秀";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            environment.setState(new LowState(this));
        } else if (score < 90) {
            environment.setState(new MiddleState(this));
        }
    }
}
