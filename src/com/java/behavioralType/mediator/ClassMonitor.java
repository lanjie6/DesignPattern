package com.java.behavioralType.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 班长（具体中介者角色）
 */
public class ClassMonitor implements Mediator {

    //利用map集合存放学委的相关属性
    private Map<String, ClassLeader> map = new HashMap<>();

    /**
     * 将对应名称的学委对象进行注册
     */
    @Override
    public void register(String name, ClassLeader classLeader) {
        map.put(name, classLeader);
    }

    /**
     * 班长大人获取来自指定学委的请求通知
     */
    @Override
    public void command(String name) {
        map.get(name).job();
    }
}
