package com.java.behavioralType.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体明星类（具体主题角色）
 * 包含最新的动态的内容，还包含关注的所有粉丝，当明星发动态的时候，这里使用推模式主动调用
 * 粉丝对象的更新方法，然后让关注的粉丝知道最新的态的内容。
 */
public class ConcreteStar implements Star {

    /*
     * 最新发布的动态内容
     */
    private String starDynamicContent;

    /*
     * 关注我的粉丝们
     */
    private List<Fan> myFanList = new ArrayList<>();


    /**
     * 发布一条新的动态方法
     */
    public void publishing(String toPublishContent) {
        this.starDynamicContent = toPublishContent;
        //由于使用的是推模式，所以主动调用
        notifyFan();
    }

    @Override
    public void addFan(Fan fan) {
        myFanList.add(fan);
    }

    @Override
    public void removeFan(Fan fan) {
        myFanList.remove(fan);
    }

    @Override
    public void notifyFan() {
        for (Fan f : myFanList) {
            f.update(starDynamicContent);
        }
    }
}
