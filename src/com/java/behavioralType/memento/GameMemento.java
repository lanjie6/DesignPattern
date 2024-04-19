package com.java.behavioralType.memento;

/**
 * 备份（备忘录角色）
 */
public class GameMemento {

    //步数
    private int playerSteps;

    /**
     * 备份步数
     */
    public GameMemento(int playerSteps) {
        this.playerSteps = playerSteps;
    }

    public int getPlayerSteps() {
        return playerSteps;
    }
}
