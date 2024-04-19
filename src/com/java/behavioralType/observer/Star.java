package com.java.behavioralType.observer;

/**
 * 明星接口（抽象主题角色）
 */
public interface Star {

    /**
     * 新增粉丝方法
     */
    void addFan(Fan fan);

    /**
     * 删除粉丝方法
     */
    void removeFan(Fan fan);

    /**
     * 通知粉丝有新动态的方法
     */
    void notifyFan();
}
