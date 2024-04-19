package com.java.behavioralType.observer;

/**
 * 台湾省粉丝类
 */
public class TailWanFan implements Fan {

    /*
     * 关注的明星发的动态内容
     */
    private String dynamicContent;

    /**
     * 更新动态内容方法
     */
    @Override
    public void update(String newDnmcCtt) {
        this.dynamicContent = newDnmcCtt;
        display();
    }

    /**
     * 显示关注明星动态方法
     */
    public void display() {
        System.out.println("台湾粉丝知道了关注的明星的最新动态是：" + dynamicContent);
    }
}
