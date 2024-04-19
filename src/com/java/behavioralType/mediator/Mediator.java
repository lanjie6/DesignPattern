package com.java.behavioralType.mediator;

/**
 * 中介者接口类（抽象中介者）
 */
public interface Mediator {

    /**
     * 注册班委员
     */
    void register(String name, ClassLeader classLeader);

    /**
     * 班长根据班委员名字获得通知请求
     */
    void command(String name);
}
